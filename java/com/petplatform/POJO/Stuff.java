package com.petplatform.POJO;

public class Stuff {
    private String stuffIdNumber;
    private String stuffName;
    private String stuffGender;
    private int stuffAge;
    private String stuffPhoneNumber;
    private String stuffJob;
    private String stuffEmail;

    public int getStuffAge() {
        return stuffAge;
    }

    public void setStuffAge(int stuffAge) {
        this.stuffAge = stuffAge;
    }

    public String getStuffEmail() {
        return stuffEmail;
    }

    public void setStuffEmail(String stuffEmail) {
        this.stuffEmail = stuffEmail;
    }

    public String getStuffGender() {
        return stuffGender;
    }

    public void setStuffGender(String stuffGender) {
        this.stuffGender = stuffGender;
    }

    public String getStuffIdNumber() {
        return stuffIdNumber;
    }

    public void setStuffIdNumber(String stuffIdNumber) {
        this.stuffIdNumber = stuffIdNumber;
    }

    public String getStuffJob() {
        return stuffJob;
    }

    public void setStuffJob(String stuffJob) {
        this.stuffJob = stuffJob;
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public String getStuffPhoneNumber() {
        return stuffPhoneNumber;
    }

    public void setStuffPhoneNumber(String stuffPhoneNumber) {
        this.stuffPhoneNumber = stuffPhoneNumber;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "stuffAge=" + stuffAge +
                ", stuffIdNumber='" + stuffIdNumber + '\'' +
                ", stuffName='" + stuffName + '\'' +
                ", stuffGender='" + stuffGender + '\'' +
                ", stuffPhoneNumber='" + stuffPhoneNumber + '\'' +
                ", stuffJob='" + stuffJob + '\'' +
                ", stuffEmail='" + stuffEmail + '\'' +
                '}';
    }
}
