package com.samczsun.skype4j.internal.participants.info;

import com.eclipsesource.json.JsonObject;
import com.samczsun.skype4j.exceptions.ConnectionException;
import com.samczsun.skype4j.internal.Endpoints;
import com.samczsun.skype4j.internal.SkypeImpl;
import com.samczsun.skype4j.internal.Utils;
import com.samczsun.skype4j.participants.info.Self;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SelfImpl implements Self {
    private SkypeImpl skype;
    private String about;
    private String avatarUrl;
    private BufferedImage avatar;
    private String birthday;
    private String city;
    private String country;
    private String emails;
    private String firstname;
    private String gender;
    private String homepage;
    private String jobtitle;
    private String language;
    private String lastname;
    private String mood;
    private String phoneHome;
    private String phoneMobile;
    private String phoneOffice;
    private String province;
    private String richMood;
    private String username;


    public SelfImpl(SkypeImpl skype, JsonObject self) {
        this.skype = skype;

        this.about = Utils.getString(self, "about");
        this.avatarUrl = Utils.getString(self, "avatarUrl");
        this.birthday = Utils.getString(self, "birthday");
        this.city = Utils.getString(self, "city");
        this.country = Utils.getString(self, "country");
        this.emails = self.get("emails") == null ? null : self.get("emails").isNull() ? null : String.valueOf(self.get("emails").asArray());
        this.firstname = Utils.getString(self, "firstname");
        this.gender = Utils.getString(self, "gender");
        this.homepage = Utils.getString(self, "homepage");
        this.jobtitle = Utils.getString(self, "jobtitle");
        this.language = Utils.getString(self, "language");
        this.lastname = Utils.getString(self, "lastname");
        this.mood = Utils.getString(self, "mood");
        this.phoneHome = Utils.getString(self, "phoneHome");
        this.phoneMobile = Utils.getString(self, "phoneMobile");
        this.phoneOffice = Utils.getString(self, "phoneOffice");
        this.province = Utils.getString(self, "province");
        this.richMood = Utils.getString(self, "richMood");
        this.username = Utils.getString(self, "username");
    }

    @Override
    public String getAbout() {
        return about;
    }

    @Override
    public BufferedImage getAvatarPicture() throws ConnectionException {
        if (this.avatarUrl != null) {
            if (this.avatar == null) {
                this.avatar = Endpoints
                        .custom(this.avatarUrl, skype)
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
    public String getBirthday() {
        return birthday;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getEmails() {
        return emails;
    }

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getHomepage() {
        return homepage;
    }

    @Override
    public String getJobTitle() {
        return jobtitle;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String getLastName() {
        return lastname;
    }

    @Override
    public String getMood() {
        return mood;
    }

    @Override
    public String getPhoneHome() {
        return phoneHome;
    }

    @Override
    public String getPhoneMobile() {
        return phoneMobile;
    }

    @Override
    public String getPhoneOffice() {
        return phoneOffice;
    }

    @Override
    public String getProvince() {
        return province;
    }

    @Override
    public String getRichMood() {
        return richMood;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
