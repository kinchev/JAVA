package com.telerikacademy.interfacesegregation.models;

public class Beer {

    private int id;

    private String name;

    private String creatorUsername;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
