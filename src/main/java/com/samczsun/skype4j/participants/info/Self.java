package com.samczsun.skype4j.participants.info;

import com.samczsun.skype4j.exceptions.ConnectionException;

import java.awt.image.BufferedImage;

public interface Self {
    String getAbout();

    BufferedImage getAvatarPicture() throws ConnectionException;

    String getBirthday();

    String getCity();

    String getCountry();

    String getEmails();

    String getFirstName();

    String getGender();

    String getHomepage();

    String getJobTitle();

    String getLanguage();

    String getLastName();

    String getMood();

    String getPhoneHome();

    String getPhoneMobile();

    String getPhoneOffice();

    String getProvince();

    String getRichMood();

    String getUsername();
}
