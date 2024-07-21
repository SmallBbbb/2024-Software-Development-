package com.petplatform.POJO;

public class User {
    private String userUsername;
    private String userPassword;
    private String userNickname;
    private String userIdNumber;
    private String userName;
    private String userGender;
    private int userAge;
    private String userPhoneNumber;
    private String userEmail;
    private boolean userVolunteerQualification;

    public boolean isUserVolunteerQualification() {
        return userVolunteerQualification;
    }

    public void setUserVolunteerQualification(boolean userVolunteerQualification) {
        this.userVolunteerQualification = userVolunteerQualification;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    @Override
    public String toString() {
        return "User{" +
                "userUsername='" + userUsername + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", userIdNumber='" + userIdNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userAge=" + userAge +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userVolunteerQualification=" + userVolunteerQualification +
                '}';
    }
}
