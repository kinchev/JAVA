package com.telerikacademy.web.springdemo.controllers;

import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.models.DisplayUserInfo;
import com.telerikacademy.web.springdemo.models.User;
import com.telerikacademy.web.springdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/info/info")
    public List<DisplayUserInfo> getAllForRegularEmployee() {
        return service.getAll().stream().map(user -> {
            DisplayUserInfo dto = new DisplayUserInfo();
            dto.setFirstName(user.getFirstName());
            dto.setLastName(user.getLastName());
            dto.setUsername(user.getEmail());
            return dto;
        }).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        try {
            return service.getById(id);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @GetMapping("/{id}/wish-list")
    public List<Beer> getWishList(@PathVariable int id) {
        return new ArrayList<>(getById(id).getWishList());
    }

}
