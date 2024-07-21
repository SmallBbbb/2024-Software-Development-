package com.petplatform.POJO;

public class Administer {
    private String administerUsername;
    private String administerPassword;

    public String getAdministerUsername() {
        return administerUsername;
    }

    public void setAdministerUsername(String administerUsername) {
        this.administerUsername = administerUsername;
    }

    public String getAdministerPassword() {
        return administerPassword;
    }

    public void setAdministerPassword(String administerPassword) {
        this.administerPassword = administerPassword;
    }

    @Override
    public String toString() {
        return "Administer{" +
                "administerPassword='" + administerPassword + '\'' +
                ", administerUsername='" + administerUsername + '\'' +
                '}';
    }
}
