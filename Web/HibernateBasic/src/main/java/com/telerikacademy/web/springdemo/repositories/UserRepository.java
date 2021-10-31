package com.telerikacademy.web.springdemo.repositories;

import com.telerikacademy.web.springdemo.models.User;

import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User getById(int id);

    User getByEmail(String email);

    void create(User user);

    void update(User user);

    void delete(int id);

}
