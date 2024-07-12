package com.softwaredevelopment.petplatform.POJO;

public class UserBean {

    private int accountNumber;
    private String password;
    private String username;
    private String nickname;
    private String name;
    private String phoneNumber;
    private String sex;
    private String accountState;
    private String volunteerQualification;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAccountState() {
        return accountState;
    }

    public void setAccountState(String accountState) {
        this.accountState = accountState;
    }

    public String getVolunteerQualification() {
        return volunteerQualification;
    }

    public void setVolunteerQualification(String volunteerQualification) {
        this.volunteerQualification = volunteerQualification;
    }
}
