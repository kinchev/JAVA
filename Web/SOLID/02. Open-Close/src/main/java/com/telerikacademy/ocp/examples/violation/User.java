package com.telerikacademy.ocp.examples.violation;


import com.telerikacademy.ocp.models.Beer;

import java.util.List;

public class User {
    private String username;
    private String role;
    private String email;
    private List<Beer> wishList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Beer> getWishList() {
        return wishList;
    }

    public void setWishList(List<Beer> wishList) {
        this.wishList = wishList;
    }
}
