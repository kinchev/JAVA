package com.telerikacademy.web.springdemo.models;

import javax.validation.constraints.*;

public class Beer {
    @NotBlank
    private  Style style;

    @Positive(message = "Id should be positive")
    private int id;

    @NotNull(message = "Name can't be empty")
    @Size(min = 2, max = 20, message = "Name should be between 2 and 20 symbols")
    private String name;

    @Positive(message = "ABV should be positive")
    private double abv;

    public Beer() {
    }

    public Beer(int id, String name, double abv) {
        this.id = id;
        this.name = name;
        this.abv = abv;
    }

    public Beer(int id, String name, double abv, Style style) {
        this(id,name,abv);
        this.style = style;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

}
