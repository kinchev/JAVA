package com.telerikacademy.lsp.examples.improved.models;


import com.telerikacademy.lsp.models.Beer;

import java.util.List;

public class Employee extends BaseUser {
    @Override
    public List<Beer> getWishList() {
        throw new UnsupportedOperationException("Employees do not have a wishlist!");
    }

    @Override
    public void setWishList(List<Beer> list) {
        throw new UnsupportedOperationException("Employees do not have a wishlist!");
    }
}
