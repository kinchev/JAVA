package com.telerikacademy.lsp.examples.solution.models;


import com.telerikacademy.lsp.models.Beer;

import java.util.List;

public abstract class UserWithList extends BaseUser {
    private List<Beer> wishList;

    public List<Beer> getWishList() {
        return wishList;
    }

    public void setWishList(List<Beer> wishList) {
        this.wishList = wishList;
    }
}
