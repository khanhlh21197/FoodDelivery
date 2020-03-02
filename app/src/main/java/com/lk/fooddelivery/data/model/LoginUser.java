package com.lk.fooddelivery.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoginUser {

    private String userName;
    private String displayName;
    private String password;

    public LoginUser(String userName, String displayName, String password) {
        this.userName = userName;
        this.displayName = displayName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
