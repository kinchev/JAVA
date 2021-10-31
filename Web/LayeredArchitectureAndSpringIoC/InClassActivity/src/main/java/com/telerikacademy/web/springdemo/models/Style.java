package com.telerikacademy.web.springdemo.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.List;

public class Style {

    @Positive(message = "Id should be positive")
    private int id;

    @NotBlank(message = "Name can`t be empty")
    @Size(min = 2, max = 20, message = "Name should be between 2 and 20 symbols")
    private String name;

    public Style(){};

    public Style(int id,String name){
        this.id=id;
        this.name=name;
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
}
