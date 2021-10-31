package com.telerikacademy.web.springdemo.repositories;

import com.telerikacademy.web.springdemo.models.User;

import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User getById(int id);

}
