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

package com.samczsun.skype4j.internal.participants.info;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.samczsun.skype4j.Skype;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.exceptions.ChatNotFoundException;
import com.samczsun.skype4j.exceptions.ConnectionException;
import com.samczsun.skype4j.exceptions.NoSuchContactException;
import com.samczsun.skype4j.internal.Endpoints;
import com.samczsun.skype4j.internal.SkypeImpl;
import com.samczsun.skype4j.internal.Utils;
import com.samczsun.skype4j.internal.client.FullClient;
import com.samczsun.skype4j.internal.utils.Encoder;
import com.samczsun.skype4j.participants.info.Contact;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.helper.Validate;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.regex.Pattern;

public class ContactImpl implements Contact {
    private static final Pattern PHONE_NUMBER = Pattern.compile("\\+[0-9]+");

    public static Contact createContact(SkypeImpl skype, String username) throws ConnectionException {
        Validate.notEmpty(username, "Username must not be empty");
        return new ContactImpl(skype, username, getObject(skype, username));
    }

    public static Contact createContact(SkypeImpl skype, String username, JsonObject unaddedData) throws ConnectionException {
        Validate.notEmpty(username, "Username must not be empty");
        return new ContactImpl(skype, username, unaddedData);
    }

    private static JsonObject getObject(SkypeImpl skype, String username) throws ConnectionException {
        JsonArray array = Endpoints.PROFILE_INFO
                .open(skype)
                .expect(200, "While getting contact info")
                .as(JsonArray.class)
                .post(new JsonObject()
                        .add("usernames", new JsonArray()
                                .add(username)
                        )
                );
        return array.get(0).asObject();
    }

    private SkypeImpl skype;
    private String username;
    private String displayName;
    private String displayNameSource;
    private JsonObject profile;
    private String avatarURL;
    private String birthday;
    private String gender;
    private JsonObject locations;


    private String firstName;
    private String lastName;
    private String language;
    private BufferedImage avatar;
    private String mood;
    private JsonObject name;
    private String first;
    private String surname;
    private String nickname;
    private JsonObject phones;
    private String number;
    private String phoneType;

    private String richMood;
    private String country;
    private String city;
    private String state;

    private boolean isPhone;

    private boolean isAuthorized;
    private boolean isBlocked;
    private boolean isSuggested;
    private boolean isExplicit;
    private String creationTime;

    // What is this?
    private String authCertificate;
    private String personId;
    private String type;

    public ContactImpl(SkypeImpl skype, String username, JsonObject unaddedData) throws ConnectionException {
        this.skype = skype;
        this.username = username;
        if (!PHONE_NUMBER.matcher(username).matches()) {
            updateProfile(unaddedData);
            updateContactInfo();
        } else {
            this.isPhone = true;
        }
    }

    public ContactImpl(SkypeImpl skype, JsonObject contact) throws ConnectionException {
        this.skype = skype;
        update(contact);
        updateProfile(getObject(skype, getUsername()));
    }

    private void updateContactInfo() {
        if (this.skype instanceof FullClient) {
            try {
                JsonObject obj = Endpoints.GET_CONTACT_BY_ID
                        .open(skype, skype.getUsername())
                        .as(JsonObject.class)
                        .expect(200, "While getting contact info")
                        .get();
                if (obj.get("contacts").asArray().size() > 0) {
                    JsonObject contact = obj.get("contacts").asArray().get(0).asObject();
                    update(contact);
                } else {
                    this.isAuthorized = false;
                    this.isBlocked = false;
                }
            } catch (ConnectionException ignored) {
            }
        }
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public BufferedImage getAvatarPicture() throws ConnectionException {
        if (this.avatarURL != null) {
            if (this.avatar == null) {
                //Casting might not be safe.
                this.avatar = Endpoints
                        .custom(this.avatarURL, skype)
                        .expect(200, "While fetching avatar")
                        .as(BufferedImage.class)
                        .get();

            }
            BufferedImage clone = new BufferedImage(avatar.getWidth(), avatar.getHeight(), avatar.getType());
            Graphics2D g2d = clone.createGraphics();
            g2d.drawImage(avatar, 0, 0, null);
            g2d.dispose();
            return clone;
        }
        return null;
    }

    @Override
    public String getAvatarURL() {
        return this.avatarURL;
    }

    @Override
    public String getMood() {
        return this.mood;
    }

    @Override
    public String getRichMood() {
        return this.richMood;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public boolean isAuthorized() {
        return this.isAuthorized;
    }

    @Override
    public void authorize() throws ConnectionException {
        Endpoints.AUTHORIZE_CONTACT_SELF.open(skype, StringUtils.prependIfMissing(this.username, "8:"))
                .header("BehaviorOverride", "redirectAs404")
                .expect(c -> c == 200 || c == 404, "While adding to contact list").put();
        updateContactInfo();
    }

    @Override
    public void unauthorize() throws ConnectionException {

        Endpoints.UNAUTHORIZE_CONTACT
                .open(skype, skype.getUsername(), this.username)
                .expect(200, "While anauthorizing contact")
                .delete();
        Endpoints.UNAUTHORIZE_CONTACT_SELF
                .open(skype, this.username)
                .expect(200, "While unauthorizing contact")
                .delete();
        updateContactInfo();
    }

    @Override
    public void sendRequest(String message) throws ConnectionException {
        JsonObject requestObject = new JsonObject();
        requestObject
                .add("mri", "8:" + this.username)
                .add("greeting", Encoder.encode(message));
        Endpoints.SEND_CONTACT_REQUEST
                .open(skype, skype.getUsername())
                .on(404, (connection) -> {
                    throw new NoSuchContactException();
                })
                .expect(201, "While sending request")
                .expect(200, "While sending request")
                .put(requestObject);
        updateContactInfo();
    }

    @Override
    public boolean isBlocked() {
        return this.isBlocked;
    }

    @Override
    public void block(boolean reportAbuse) throws ConnectionException {
        Endpoints.BLOCK_CONTACT
                .open(skype, this.username)
                .expect(201, "While unblocking contact")
                .put("reporterIp=127.0.0.1&uiVersion=" + Skype.VERSION + (reportAbuse ? "&reportAbuse=1" : ""));
        updateContactInfo();
    }

    @Override
    public void unblock() throws ConnectionException {
        Endpoints.UNBLOCK_CONTACT.open(skype, this.username).expect(201, "While unblocking contact").put();
        updateContactInfo();
    }

    @Override
    public boolean isPhone() {
        return this.isPhone;
    }

    @Override
    public Chat getPrivateConversation() throws ConnectionException, ChatNotFoundException {
        return skype.getOrLoadChat(this.username);
    }

    public void update(JsonObject contact) {
        this.personId = Utils.getString(contact, "person_id");
        this.username = Utils.getString(contact, "mri");
        this.displayName = Utils.getString(contact, "display_name");
        this.displayNameSource = Utils.getString(contact, "display_name_source");

        this.profile = contact.get("profile") == null ? null : contact.get("profile").asObject();
        if (profile != null) {
            this.avatarURL = Utils.getString(profile, "avatar_url");
            this.birthday = Utils.getString(profile, "birthday");
            this.gender = Utils.getString(profile, "gender");

            this.locations = profile.get("locations") == null ? null : profile.get("locations").asArray().get(0).asObject();
            if (locations != null) {
                this.type = Utils.getString(locations, "type");
                this.country = Utils.getString(locations, "country");
                this.city = Utils.getString(locations, "city");
                this.state = Utils.getString(locations, "state");
            }
            this.mood = Utils.getString(contact, "mood");

            this.name = profile.get("name") == null ? null : profile.get("name").asObject();
            if (name != null) {
                this.first = Utils.getString(name, "first");
                this.surname = Utils.getString(name, "surname");
                this.nickname = Utils.getString(name, "nickname");
            }

            this.phones = profile.get("phones") == null ? null : profile.get("phones").asArray().get(0).asObject();
            if (phones != null) {
                this.number = Utils.getString(phones, "number");
                this.phoneType = Utils.getString(phones, "type");
            }
            this.language = Utils.getString(profile, "language");

        }
        this.isAuthorized = contact.get("authorized").asBoolean();
        this.authCertificate = Utils.getString(contact, "auth_certificate");
        this.isBlocked = contact.get("blocked").asBoolean();
        this.creationTime = Utils.getString(contact, "type");
    }

    public void updateProfile(JsonObject profile) {
        this.firstName = Utils.getString(profile, "firstname");
        this.lastName = Utils.getString(profile, "lastname");
        this.birthday = Utils.getString(profile, "birthday");

        if (profile.get("gender") != null) {
            if (profile.get("gender").isNumber()) {
                this.gender = String.valueOf(profile.get("gender").asInt());
            } else if (profile.get("gender").isString()) {
                this.gender = profile.get("gender").asString();
            } else if (profile.get("gender").isBoolean()) {
                this.gender = profile.get("gender").asBoolean() ? "1" : "0";
            } else {
                this.gender = profile.get("gender").toString();
            }
        }

        this.language = Utils.getString(profile, "language");
        this.avatarURL = Utils.getString(profile, "avatarUrl");

        if (this.displayName == null)
            this.displayName = Utils.getString(profile, "displayname");
        if (this.mood == null)
            this.mood = Utils.getString(profile, "mood");
        if (this.richMood == null)
            this.richMood = Utils.getString(profile, "richMood");
        if (this.country == null)
            this.country = Utils.getString(profile, "country");
        if (this.city == null)
            this.city = Utils.getString(profile, "city");

        if (this.displayName == null) {
            if (this.firstName != null) {
                this.displayName = this.firstName;
                if (this.lastName != null) {
                    this.displayName = this.displayName + " " + this.lastName;
                }
            } else if (this.lastName != null) {
                this.displayName = this.lastName;
            } else {
                this.displayName = this.username;
            }
        }
    }
}
