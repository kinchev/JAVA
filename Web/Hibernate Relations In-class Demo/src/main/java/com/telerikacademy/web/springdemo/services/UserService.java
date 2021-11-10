package com.telerikacademy.web.springdemo.services;

import com.telerikacademy.web.springdemo.models.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(int id);
    List<User> getUsers(int styleId);

}
