package com.petplatform.POJO;

import java.sql.Timestamp;

public class Task {
    private int taskNumber;
    private String taskSubject;
    private String captainNumber;
    private Timestamp taskReleaseTime;
    private String taskLocation;
    private String taskDescription;
    private String taskState;

    public String getCaptainNumber() {
        return captainNumber;
    }

    public void setCaptainNumber(String captainNumber) {
        this.captainNumber = captainNumber;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskLocation() {
        return taskLocation;
    }

    public void setTaskLocation(String taskLocation) {
        this.taskLocation = taskLocation;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public Timestamp getTaskReleaseTime() {
        return taskReleaseTime;
    }

    public void setTaskReleaseTime(Timestamp taskReleaseTime) {
        this.taskReleaseTime = taskReleaseTime;
    }

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public String getTaskSubject() {
        return taskSubject;
    }

    public void setTaskSubject(String taskSubject) {
        this.taskSubject = taskSubject;
    }

    @Override
    public String toString() {
        return "Task{" +
                "captainNumber='" + captainNumber + '\'' +
                ", taskNumber=" + taskNumber +
                ", taskSubject='" + taskSubject + '\'' +
                ", taskReleaseTime=" + taskReleaseTime +
                ", taskLocation='" + taskLocation + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskState='" + taskState + '\'' +
                '}';
    }
}
