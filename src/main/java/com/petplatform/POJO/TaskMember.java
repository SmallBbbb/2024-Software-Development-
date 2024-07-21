package com.petplatform.POJO;

public class TaskMember {
    private int taskNumber;
    private String memberNumber;

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public String toString() {
        return "TaskMember{" +
                "memberNumber='" + memberNumber + '\'' +
                ", taskNumber=" + taskNumber +
                '}';
    }
}
