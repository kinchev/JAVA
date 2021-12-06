package com.telerikacademy.ocp.examples.solution;

public abstract class BaseUser {
    private String email;
    private String username;

    public abstract String getDisplayName();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
