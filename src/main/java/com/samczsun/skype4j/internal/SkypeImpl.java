/*
 * Copyright 2016 Sam Sun <me@samczsun.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.samczsun.skype4j.internal;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;
import com.samczsun.skype4j.Skype;
import com.samczsun.skype4j.Visibility;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.chat.GroupChat;
import com.samczsun.skype4j.events.EventDispatcher;
import com.samczsun.skype4j.exceptions.ChatNotFoundException;
import com.samczsun.skype4j.exceptions.ConnectionException;
import com.samczsun.skype4j.exceptions.NoPermissionException;
import com.samczsun.skype4j.exceptions.SkypeAuthenticationException;
import com.samczsun.skype4j.exceptions.handler.ErrorHandler;
import com.samczsun.skype4j.exceptions.handler.ErrorSource;
import com.samczsun.skype4j.internal.chat.ChatImpl;
import com.samczsun.skype4j.internal.client.auth.SkypeAuthProvider;
import com.samczsun.skype4j.internal.client.auth.SkypeRegistrationProvider;
import com.samczsun.skype4j.internal.participants.info.BotInfoImpl;
import com.samczsun.skype4j.internal.participants.info.ContactImpl;
import com.samczsun.skype4j.internal.threads.AuthenticationChecker;
import com.samczsun.skype4j.internal.threads.PollThread;
import com.samczsun.skype4j.internal.threads.ServerPingThread;
import com.samczsun.skype4j.internal.utils.Encoder;
import com.samczsun.skype4j.participants.info.BotInfo;
import com.samczsun.skype4j.participants.info.Contact;
import org.jsoup.helper.Validate;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.*;
import java.util.logging.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class SkypeImpl implements Skype {
    public static final Pattern PAGE_SIZE_PATTERN = Pattern.compile("pageSize=([0-9]+)");
    static final String VERSION = "0.2.9-SNAPSHOT";
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    protected final AtomicBoolean loggedIn = new AtomicBoolean(false);
    protected final Map<String, Contact> allContacts = Collections.synchronizedMap(new HashMap<>());
    protected final Set<Contact.ContactRequest> allContactRequests = Collections.synchronizedSet(new HashSet<>());
    private final AtomicBoolean shutdownRequested = new AtomicBoolean(false);
    private final AtomicBoolean subscribed = new AtomicBoolean(false);
    private final UUID guid = UUID.randomUUID();
    private final Set<String> resources;
    private final List<ErrorHandler> errorHandlers;
    // Data
    private final Map<String, ChatImpl> allChats = Collections.synchronizedMap(new HashMap<>());
    private final Map<String, BotInfoImpl> allBots = Collections.synchronizedMap(new HashMap<>());
    private final SkypeRegistrationProvider regTokenProvider;
    protected Map<String, String> cookies = new HashMap<>();
    protected Logger logger = Logger.getLogger(Skype.class.getCanonicalName());
    private ExecutorService scheduler;
    private ExecutorService shutdownThread;
    private EventDispatcher eventDispatcher = new SkypeEventDispatcher(this);
    private ServerPingThread serverPingThread;
    private AuthenticationChecker reauthThread;
    private PollThread pollThread;
    private SkypeWebSocket wss;
    private String conversationSyncState;
    private String cloud = "";
    private JsonObject trouterData;
    private int socketId = 1;

    public SkypeImpl(Set<String> resources, Logger logger, List<ErrorHandler> errorHandlers) {
        this.regTokenProvider = new SkypeRegistrationProvider();
        this.resources = Collections.unmodifiableSet(new HashSet<>(resources));
        this.errorHandlers = Collections.unmodifiableList(new ArrayList<>(errorHandlers));
        if (logger != null) {
            this.logger = logger;
        } else {
            Handler handler = new ConsoleHandler();
            handler.setFormatter(new Formatter() {
                @Override
                public String format(LogRecord record) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[").append(record.getLevel().getLocalizedName()).append("] ");
                    sb.append("[").append(new Date(record.getMillis())).append("] ");
                    sb.append(formatMessage(record)).append(LINE_SEPARATOR);

                    if (record.getThrown() != null) {
                        StringWriter sw = new StringWriter();
                        PrintWriter pw = new PrintWriter(sw);
                        record.getThrown().printStackTrace(pw);
                        pw.close();
                        sb.append(sw.toString());
                    }
                    return sb.toString();
                }
            });
            this.logger.setUseParentHandlers(false);
            this.logger.addHandler(handler);
        }
    }

    public SkypeRegistrationProvider getRegTokenProvider() {
        return regTokenProvider;
    }

    protected abstract SkypeAuthProvider getAuthProvider();

    @Override
    public void login() throws ConnectionException, SkypeAuthenticationException {
        Endpoints.ELIGIBILITY_CHECK.open(this)
                .expect(200, "You are not eligible to use Skype for Web!")
                .get();

        this.loggedIn.compareAndSet(false, true);
        if (this.serverPingThread != null) {
            this.serverPingThread.kill();
            this.serverPingThread = null;
        }
        if (this.reauthThread != null) {
            this.reauthThread.kill();
            this.reauthThread = null;
        }
        if (scheduler != null && !scheduler.isTerminated()) {
            scheduler.shutdownNow();
            //TODO this looks fishy, find alternative
            while (!scheduler.isTerminated()) ;
        }
        shutdownThread = Executors.newSingleThreadExecutor(new SkypeThreadFactory(this, "Shutdown"));
        scheduler = Executors.newFixedThreadPool(4, new SkypeThreadFactory(this, "Poller"));
        (serverPingThread = new ServerPingThread(this)).start();
        (reauthThread = new AuthenticationChecker(this)).start();
    }

    public List<Chat> loadMoreChats(int amount) throws ConnectionException {
        try {
            JsonObject data;
            if (this.conversationSyncState == null) {
                InputStream input = Endpoints.LOAD_CHATS
                        .open(this, System.currentTimeMillis(), amount)
                        .as(InputStream.class)
                        .expect(200, "While loading chats")
                        .get();
                data = Utils.parseJsonObject(input);
            } else {
                Matcher matcher = PAGE_SIZE_PATTERN.matcher(this.conversationSyncState);
                String url = matcher.replaceAll("pageSize=" + amount);
                data = Endpoints
                        .custom(url, this)
                        .as(JsonObject.class)
                        .expect(200, "While loading chats")
                        .header("RegistrationToken", this.getRegistrationToken())
                        .get();
            }

            List<Chat> chats = new ArrayList<>();

            for (JsonValue value : data.get("conversations").asArray()) {
                try {
                    chats.add(this.getOrLoadChat(value.asObject().get("id").asString()));
                } catch (ChatNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IllegalArgumentException e) {
                    handleError(null, new RuntimeException(value.toString(), e), false);
                }
            }

            JsonObject metadata = data.get("_metadata").asObject();
            if (metadata.get("syncState") != null) {
                this.conversationSyncState = metadata.get("syncState").asString();
            }
            return chats;
        } catch (IOException e) {
            throw ExceptionHandler.generateException("While loading chats", e);
        }
    }

    private JsonObject buildSubscriptionObject() {
        JsonObject subscriptionObject = new JsonObject();
        subscriptionObject.add("channelType", "httpLongPoll");
        subscriptionObject.add("template", "raw");
        JsonArray interestedResources = new JsonArray();
        this.resources.forEach(interestedResources::add);
        subscriptionObject.add("interestedResources", interestedResources);
        return subscriptionObject;
    }

    public void shutdown() {
        if (this.loggedIn.get()) {
            loggedIn.set(false);
            shutdownRequested.set(true);
            this.shutdownThread.submit(() -> {
                shutdownThread.shutdown();
                reauthThread.kill();
                scheduler.shutdownNow();
                //TODO this looks fishy, find alternative
                while (!scheduler.isTerminated()) ;
                doShutdown();
            });
        }
    }

    private void doShutdown() {
        if (this.pollThread != null) {
            this.pollThread.shutdown();
            this.pollThread = null;
        }
        if (this.serverPingThread != null) {
            this.serverPingThread.kill();
            this.serverPingThread = null;
        }
        if (this.reauthThread != null) {
            this.reauthThread.kill();
            this.reauthThread = null;
        }
        if (this.wss != null) {
            this.wss.close();
            this.wss = null;
        }

        if (scheduler != null && !scheduler.isTerminated()) {
            scheduler.shutdownNow();
            //TODO this looks fishy, find alternative
            while (!scheduler.isTerminated()) ;
        }
    }

    public void updateCloud(String anyLocation) {
        Pattern grabber = Pattern.compile("https?://([^-]*-)client-s");
        Matcher m = grabber.matcher(anyLocation);
        if (m.find()) {
            this.cloud = m.group(1);
        }
    }

    @Override
    public Chat getChat(String name) {
        return allChats.get(name);
    }

    @Override
    public ChatImpl loadChat(String name) throws ConnectionException, ChatNotFoundException {
        if (!allChats.containsKey(name)) {
            ChatImpl chat = Factory.createChat(this, name);
            allChats.put(name, chat);
            return chat;
        } else {
            throw new IllegalArgumentException("Chat already exists");
        }
    }

    @Override
    public ChatImpl getOrLoadChat(String name) throws ConnectionException, ChatNotFoundException {
        if (allChats.containsKey(name)) {
            return allChats.get(name);
        } else {
            return loadChat(name);
        }
    }

    @Override
    public GroupChat joinChat(String id) throws ConnectionException, ChatNotFoundException {
        Validate.isTrue(id.startsWith("19:") && id.endsWith("@thread.skype"), "Invalid chat id");
        JsonObject obj = new JsonObject();
        obj.add("role", "User");
        Endpoints.ADD_MEMBER_URL.open(this, id, getUsername()).on(403, (connection) -> {
            throw new NoPermissionException();
        }).on(404, (connection) -> {
            throw new ChatNotFoundException();
        }).expect(200, "While joining chat").put(obj);
        return (GroupChat) getOrLoadChat(id);
    }

    @Override
    public Contact getContact(String name) {
        return this.allContacts.get(name);
    }

    @Override
    public Contact loadContact(String name) throws ConnectionException {
        if (!allContacts.containsKey(name)) {
            Contact contact = ContactImpl.createContact(this, name);
            allContacts.put(name, contact);
            return contact;
        } else {
            throw new IllegalArgumentException("Contact already exists");
        }
    }

    @Override
    public Contact getOrLoadContact(String username) throws ConnectionException {
        Contact contact = allContacts.get(username);
        if (contact == null) {
            contact = loadContact(username);
            allContacts.put(username, contact);
        }
        return contact;
    }

    @Override
    public BotInfo getOrLoadBotInfo(String botId) throws ConnectionException {
        BotInfoImpl botInfo = this.allBots.get(botId);
        if (botInfo == null) {
            botInfo = new BotInfoImpl(this, botId);
            botInfo.load();
            this.allBots.put(botInfo.getId(), botInfo);
        }
        return botInfo;
    }

    public abstract void getContactRequests() throws ConnectionException;

    public abstract void updateContactList() throws ConnectionException;

    void registerWebSocket() throws ConnectionException, InterruptedException, URISyntaxException, KeyManagementException, NoSuchAlgorithmException, UnsupportedEncodingException {
        boolean needsToRegister = false;
        if (trouterData == null) {
            trouterData = Endpoints.TROUTER_URL
                    .open(this)
                    .as(JsonObject.class)
                    .expect(200, "While fetching trouter data")
                    .post();
            needsToRegister = true;
        } else {
            Endpoints.RECONNECT_WEBSOCKET
                    .open(this, trouterData.get("connId"))
                    .expect(200, "Requesting websocket reconnect")
                    .post();
        }

        JsonObject policyResponse = Endpoints.POLICIES_URL
                .open(this)
                .as(JsonObject.class)
                .expect(200, "While fetching policy data")
                .post(new JsonObject().add("sr", trouterData.get("connId")));

        Map<String, String> data = new HashMap<>();
        for (JsonObject.Member value : policyResponse) {
            data.put(value.getName(), Utils.coerceToString(value.getValue()));
        }
        data.put("r", Utils.coerceToString(trouterData.get("instance")));
        data.put("p", String.valueOf(trouterData.get("instancePort").asInt()));
        data.put("ccid", Utils.coerceToString(trouterData.get("ccid")));
        data.put("v", "v2"); //TODO: MAGIC VALUE
        data.put("dom", "web.skype.com"); //TODO: MAGIC VALUE
        data.put("refreshToken", "true"); //TODO: MAGIC VALUE
        data.put("tc", new JsonObject()
                .add("cv", "2015.11.05")
                .add("hr", "")
                .add("v", "1.34.99")
                .toString()); //TODO: MAGIC VALUE
        data.put("timeout", "55");
        data.put("t", String.valueOf(System.currentTimeMillis()));

        StringBuilder args = new StringBuilder();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            args
                    .append(URLEncoder.encode(entry.getKey(), "UTF-8"))
                    .append("=")
                    .append(URLEncoder.encode(entry.getValue(), "UTF-8"))
                    .append("&");
        }

        String socketio = Utils.coerceToString(trouterData.get("socketio"));
        if (socketio.endsWith("/")) {
            socketio = socketio.substring(0, socketio.length() - 1);
        }

        String socketURL = socketio + "/socket.io/" + socketId + "/?" + args.toString();

        String websocketData = Endpoints
                .custom(socketURL, this)
                .as(String.class)
                .expect(200, "While fetching websocket details")
                .get();

        if (needsToRegister) {
            Endpoints.REGISTRATIONS
                    .open(this)
                    .expect(202, "While registering websocket")
                    .post(new JsonObject()
                            .add("clientDescription", new JsonObject()
                                    .add("aesKey", "")
                                    .add("languageId", "en-US")
                                    .add("platform", "Chrome")
                                    .add("platformUIVersion", Skype.VERSION)
                                    .add("templateKey", "SkypeWeb_1.1"))
                            .add("registrationId", UUID.randomUUID().toString())
                            .add("nodeId", "")
                            .add("transports", new JsonObject().add("TROUTER", new JsonArray().add(new JsonObject()
                                    .add("context", "")
                                    .add("ttl", 3600)
                                    .add("path", trouterData.get("surl"))))));
        }

        this.wss = new SkypeWebSocket(this,
                new URI(String.format("%s/socket.io/" + socketId + "/websocket/%s?%s", "wss://" + socketio.replaceAll("https?://", "").replace(":443", ""),
                        websocketData.split(":")[0], args.toString())));
        this.wss.connectBlocking();
        socketId++;
    }

    public void subscribe() throws ConnectionException {
        try {
            HttpURLConnection connection = Endpoints.SUBSCRIPTIONS_URL
                    .open(this)
                    .dontConnect()
                    .post(buildSubscriptionObject());
            if (connection.getResponseCode() == 404) {
                if (connection.getHeaderField("Set-RegistrationToken") != null) {
                    getRegTokenProvider().setRegistrationToken(connection.getHeaderField("Set-RegistrationToken"));
                }
                Endpoints
                        .custom("https://" + this.getCloud() + "client-s.gateway.messenger.live.com/v1/users/ME/endpoints/" + Encoder
                                .encode(getRegTokenProvider().getEndpointId()), this)
                        .header("RegistrationToken", getRegistrationToken())
                        .expect(200, "Err")
                        .put(new JsonObject().add("endpointFeatures", "Agent"));
                connection = Endpoints.SUBSCRIPTIONS_URL.open(this).dontConnect().post(buildSubscriptionObject());
            }
            if (connection.getResponseCode() != 201) {
                throw ExceptionHandler.generateException("While subscribing", connection);
            }
            Endpoints.MESSAGINGSERVICE_URL
                    .open(this, Encoder.encode(getRegTokenProvider().getEndpointId()))
                    .expect(200, "While submitting messagingservice")
                    .put(getRegTokenProvider().getRegistrationObject());
            if (this.pollThread != null) {
                this.pollThread.shutdown();
                this.pollThread = null;
            }
            (pollThread = new PollThread(this, Encoder.encode(getRegTokenProvider().getEndpointId()))).start();
            subscribed.set(true);
        } catch (IOException io) {
            throw ExceptionHandler.generateException("While subscribing", io);
        } catch (ConnectionException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void reAuthenticate() throws ConnectionException,
            SkypeAuthenticationException {
        //todo: keep subscribed until reauth is finished so events aren't lost
        doShutdown();
        login();
        System.out.println(MessageFormat.format("{0}: Relogin successful", Instant.now().toString()));
        if (subscribed.get()) {
            subscribe();
        }
    }

    public String getRegistrationToken() {
        return getRegTokenProvider().getRegistrationToken();
    }

    public String getSkypeToken() {
        return getAuthProvider().getSkypeToken();
    }

    String getCloud() {
        return this.cloud;
    }

    public Map<String, String> getCookies() {
        return this.cookies;
    }

    public EventDispatcher getEventDispatcher() {
        return this.eventDispatcher;
    }

    public boolean isShutdownRequested() {
        return this.shutdownRequested.get();
    }

    public Logger getLogger() {
        return this.logger;
    }

    public boolean isLoggedIn() {
        return loggedIn.get();
    }

    public ExecutorService getScheduler() {
        return this.scheduler;
    }

    public String getUsername() {
        return getAuthProvider().getUsername();
    }

    public UUID getGuid() {
        return guid;
    }

    @Override
    public Collection<Chat> getAllChats() {
        return Collections.unmodifiableCollection(this.allChats.values());
    }

    @Override
    public Collection<Contact> getAllContacts() {
        return Collections.unmodifiableCollection(this.allContacts.values());
    }

    public void handleError(ErrorSource errorSource, Throwable throwable, boolean shutdown) {
        for (ErrorHandler handler : errorHandlers) {
            try {
                handler.handle(errorSource, throwable, shutdown);
            } catch (Throwable ignored) {
            }
        }
        if (shutdown) {
            shutdown();
        }
    }

    protected HttpURLConnection getAsmToken() throws ConnectionException {
        return Endpoints.TOKEN_AUTH_URL
                .open(this)
                .as(HttpURLConnection.class)
                .cookies(cookies)
                .header("Content-Type", "application/x-www-form-encoded")
                .expect(204, "While fetching asmtoken")
                .post("skypetoken=" + Encoder.encode(getSkypeToken()));
    }

    public boolean isAuthenticated() {
        return getExpirationTime().isAfter(Instant.now());
    }

    public boolean isRegistrationTokenValid() {
        return getRegTokenProvider().getRegistrationTokenExpiry().isAfter(Instant.now());
    }

    private Instant getExpirationTime() {
        return getAuthProvider().getSkypeTokenExpiryTime();
    }

    SkypeWebSocket getWebSocket() {
        return wss;
    }

    public void setVisibility(Visibility visibility) throws ConnectionException {
        Endpoints.VISIBILITY
                .open(this)
                .expect(200, "While updating visibility")
                .put(new JsonObject().add("status", visibility.internalName()));
    }

    public String getId() {
        return "8:" + getUsername();
    }
}
