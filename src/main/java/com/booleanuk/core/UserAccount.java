package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean enabled;

    public UserAccount(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
        this.enabled = false;
    }

    private boolean checkEmail() {
        return false;
    }

    private boolean checkPassword() {
        return false;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void enable() {
        this.enabled = true;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
