package com.telerikacademy.ocp.examples.solution;


import com.telerikacademy.ocp.models.Beer;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class User extends BaseUser {
    private List<Beer> wishList;

    public List<Beer> getWishList() {
        return wishList;
    }

    public void setWishList(List<Beer> wishList) {
        this.wishList = wishList;
    }

    @Override
    public String getDisplayName() {
        return String.format("%s, Wish list: %s",
                this.getUsername(),
                this.getWishList().stream().map(Beer::getName).collect(joining(",")));
    }
}
