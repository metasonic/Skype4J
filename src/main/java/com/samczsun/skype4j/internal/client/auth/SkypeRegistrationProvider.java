package com.samczsun.skype4j.internal.client.auth;

import com.eclipsesource.json.JsonObject;
import com.samczsun.skype4j.Skype;
import com.samczsun.skype4j.exceptions.ConnectionException;
import com.samczsun.skype4j.internal.Endpoints;
import com.samczsun.skype4j.internal.SkypeImpl;
import com.samczsun.skype4j.internal.Utils;
import com.samczsun.skype4j.internal.threads.ActiveThread;
import com.samczsun.skype4j.internal.utils.Encoder;

import java.net.HttpURLConnection;
import java.time.Duration;
import java.time.Instant;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author a.semennikov
 */
public class SkypeRegistrationProvider {

    private String registrationToken;
    private Instant registrationTokenExpiry;
    private String endpointId;
    private ActiveThread endpointCheckActiveThread;

    public void registerEndpoint(SkypeImpl skype, String skypeToken) throws ConnectionException {
        String newRegToken = null;
        while (newRegToken == null) {
            HttpURLConnection post = requestEndpoint(skype, skypeToken);
            String regTokenHead = post.getHeaderField("Set-RegistrationToken");
            String locationHead = post.getHeaderField("Location");

            if (locationHead != null) {
                Matcher m = Pattern.compile("(https://[^/]+/v1)/users/ME/endpoints(/%7B([a-z0-9\\-]+)%7D)?")
                        .matcher(locationHead);
                if (m.matches()) {
                    if (m.groupCount() == 3 && m.group(3) != null) {
                        this.endpointId = "{" + m.group(3) + "}";
                    }

                    if (!m.group(1).equals(Endpoints.ENDPOINTS_URL.url())) {
                        // Skype is requiring the use of a different hostname.
                        //update cloud prefix to use in queries
                        skype.updateCloud(locationHead);
                        //Don't accept the token if present, we need to re-register first.
                    }
                }
            }

            if (regTokenHead != null) {
                newRegToken = setRegistrationToken(regTokenHead);
            }
        }
//      Not sure whay we need this here
//		Endpoints.MESSAGINGSERVICE_URL
//				.open(skype, Encoder.encode(endpointId))
//				.expect(200, "While submitting messagingservice")
//				.put(getRegistrationObject());

        if (endpointId != null) {
            if (this.endpointCheckActiveThread != null) {
                this.endpointCheckActiveThread.kill();
                this.endpointCheckActiveThread = null;
            }

            (this.endpointCheckActiveThread = new ActiveThread(skype, Encoder.encode(endpointId))).start();
        }
    }

    public String setRegistrationToken(String regTokenHead) {
        String newRegToken;
        String[] splits = regTokenHead.split(";");
        this.registrationToken = splits[0];
        newRegToken = this.registrationToken;
        long expiresInMillis = Long.parseLong(splits[1].split("=")[1]);
        this.registrationTokenExpiry = Instant.ofEpochMilli(Duration.ofSeconds(expiresInMillis).toMillis());
        if (splits.length > 2) {
            this.endpointId = splits[2].split("=")[1];
        }
        return newRegToken;
    }

    public JsonObject getRegistrationObject() {
        JsonObject publicInfo = new JsonObject()
                .add("capabilities", "video|audio")
                .add("type", 1)
                .add("skypeNameVersion", "skype.com")
                .add("nodeInfo", "")
                .add("version", Skype.VERSION);
        JsonObject privateInfo = new JsonObject()
                .add("epname", "Skype4J");
        return new JsonObject()
                .add("id", "messagingService")
                .add("type", "EndpointPresenceDoc")
                .add("selfLink", "uri")
                .add("publicInfo", publicInfo)
                .add("privateInfo", privateInfo);
    }

    private HttpURLConnection requestEndpoint(SkypeImpl skype, String skypeToken)
            throws ConnectionException {
        return Endpoints.ENDPOINTS_URL.open(skype)
                .noRedirects()
                .dontConnect()
                .on(301, (connection) -> followRedirectToRegisteredEndpoint(skype, skypeToken))
                .expect(code -> code == 201 || code == 404, "While registering endpoint")
                .header("Authentication", "skypetoken=" + skypeToken)
                .header("LockAndKey", Utils.generateChallengeHeader())
                .header("BehaviorOverride", "redirectAs404")
                .post(new JsonObject().add("endpointFeatures", "Agent"));
    }

    private HttpURLConnection followRedirectToRegisteredEndpoint(SkypeImpl skype, String skypeToken)
            throws ConnectionException {
        return Endpoints
                .custom(Endpoints.ENDPOINTS_URL.url() + "/" + Encoder.encode(endpointId), skype)
                .expect(200, "While registering endpoint")
                .header("Authentication", "skypetoken=" + skypeToken)
                .header("LockAndKey", Utils.generateChallengeHeader())
                .put(new JsonObject().add("endpointFeatures", "Agent"));
    }

    public Instant getRegistrationTokenExpiry() {
        return registrationTokenExpiry;
    }

    public String getEndpointId() {
        return endpointId;
    }

    public String getRegistrationToken() {
        return registrationToken;
    }

}
