package com.petplatform.POJO;

import java.sql.Timestamp;

public class Adoption {
    private int adoptionNumber;
    private String adopterNumber;
    private int adoptionPetNumber;
    private Timestamp adoptionTime;
    private Timestamp relyTime;
    private String adoptionSketch;
    private String checkState;

    public String getAdopterNumber() {
        return adopterNumber;
    }

    public void setAdopterNumber(String adopterNumber) {
        this.adopterNumber = adopterNumber;
    }

    public int getAdoptionNumber() {
        return adoptionNumber;
    }

    public void setAdoptionNumber(int adoptionNumber) {
        this.adoptionNumber = adoptionNumber;
    }

    public int getAdoptionPetNumber() {
        return adoptionPetNumber;
    }

    public void setAdoptionPetNumber(int adoptionPetNumber) {
        this.adoptionPetNumber = adoptionPetNumber;
    }

    public String getAdoptionSketch() {
        return adoptionSketch;
    }

    public void setAdoptionSketch(String adoptionSketch) {
        this.adoptionSketch = adoptionSketch;
    }

    public Timestamp getAdoptionTime() {
        return adoptionTime;
    }

    public void setAdoptionTime(Timestamp adoptionTime) {
        this.adoptionTime = adoptionTime;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public Timestamp getRelyTime() {
        return relyTime;
    }

    public void setRelyTime(Timestamp relyTime) {
        this.relyTime = relyTime;
    }

    @Override
    public String toString() {
        return "Adoption{" +
                "adopterNumber='" + adopterNumber + '\'' +
                ", adoptionNumber='" + adoptionNumber + '\'' +
                ", adoptionPetNumber=" + adoptionPetNumber +
                ", adoptionTime=" + adoptionTime +
                ", relyTime=" + relyTime +
                ", adoptionSketch='" + adoptionSketch + '\'' +
                ", checkState='" + checkState + '\'' +
                '}';
    }
}
