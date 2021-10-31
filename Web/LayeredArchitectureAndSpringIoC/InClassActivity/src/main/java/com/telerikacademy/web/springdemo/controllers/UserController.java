package com.telerikacademy.web.springdemo.controllers;

import com.telerikacademy.web.springdemo.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final List<User> users;

    public UserController() {
        users = new ArrayList<>();

        users.add(new User(1, "Petar", "Petrov", "pesho@mail.com"));
        users.add(new User(2, "Ivan", "Ivanov", "ivan@mail.com"));
    }

    @GetMapping
    public List<User> getAll() {
        return users;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        return getUserByIdHelper(id);
    }

    @PostMapping
    public User create(@Valid @RequestBody User user) {
        users.add(user);
        return user;
    }

    @PutMapping("/{id}")
    public User update(@PathVariable int id, @Valid @RequestBody User user) {
        User userToUpdate = getUserByIdHelper(id);

        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setEmail(user.getEmail());

        return userToUpdate;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        User userToDelete = getUserByIdHelper(id);
        users.remove(userToDelete);
    }

    private User getUserByIdHelper(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        String.format("User with id: %d not found", id)));
    }
}
