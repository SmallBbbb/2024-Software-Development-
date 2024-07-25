package com.petplatform.POJO;

public class Pet {
    private int petNumber;
    private String petName;
    private String petGender;
    private String petBreed;
    private int petAge;
    private String petAdopterId;
    private String petHealthCondition;
    private String petPhoto;
    private String petDisposition;

    public String getPetAdopterId() {
        return petAdopterId;
    }

    public void setPetAdopterId(String petAdopterId) {
        this.petAdopterId = petAdopterId;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getPetDisposition() {
        return petDisposition;
    }

    public void setPetDisposition(String petDisposition) {
        this.petDisposition = petDisposition;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public String getPetHealthCondition() {
        return petHealthCondition;
    }

    public void setPetHealthCondition(String petHealthCondition) {
        this.petHealthCondition = petHealthCondition;
    }

    public int getPetNumber() {
        return petNumber;
    }

    public void setPetNumber(int petNumber) {
        this.petNumber = petNumber;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetPhoto() {
        return petPhoto;
    }

    public void setPetPhoto(String petPhoto) {
        this.petPhoto = petPhoto;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petAdopterId=" + petAdopterId +
                ", petNumber='" + petNumber + '\'' +
                ", petName='" + petName + '\'' +
                ", petGender='" + petGender + '\'' +
                ", petBreed='" + petBreed + '\'' +
                ", petAge=" + petAge +
                ", petHealthCondition='" + petHealthCondition + '\'' +
                ", petPhoto='" + petPhoto + '\'' +
                ", petDisposition='" + petDisposition + '\'' +
                '}';
    }
}