package com.telerikacademy.lsp.examples.improved.models;


import com.telerikacademy.lsp.models.Beer;

import java.util.List;

public abstract class BaseUser {
    private String email;
    private List<Beer> wishList;

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
