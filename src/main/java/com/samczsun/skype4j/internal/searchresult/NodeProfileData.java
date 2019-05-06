package com.samczsun.skype4j.internal.searchresult;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class NodeProfileData {
    private String skypeId;
    private String avatarUrl;
    private String countryCode;
    private String contactType;
    private String name;
    private String gender;
    private String state;
    private String country;
    private String language;
    private String age;
    private String city;
    private String about;

    public String getSkypeId() {
        return skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("skypeId", skypeId)
                .append("avatarUrl", avatarUrl)
                .append("countryCode", countryCode)
                .append("contactType", contactType)
                .append("name", name)
                .append("gender", gender)
                .append("state", state)
                .append("country", country)
                .append("language", language)
                .append("age", age)
                .append("city", city)
                .append("about", about)
                .toString();
    }
}
