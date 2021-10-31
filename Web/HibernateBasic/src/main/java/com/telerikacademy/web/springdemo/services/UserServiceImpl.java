package com.telerikacademy.web.springdemo.services;

import com.telerikacademy.web.springdemo.exceptions.DuplicateEntityException;
import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.User;
import com.telerikacademy.web.springdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User getById(int id) {
        return userRepository.getById(id);
    }

    @Override
    public void create(User user) {
        boolean duplicateExists = true;
        try {
            userRepository.getByEmail(user.getEmail());
        } catch (EntityNotFoundException e) {
            duplicateExists = false;
        }

        if (duplicateExists) {
            throw new DuplicateEntityException("User", "email", user.getEmail());
        }

        userRepository.create(user);
    }

    @Override
    public void update(User user) {
        boolean duplicateExists = true;
        try {
            User existingUser = userRepository.getByEmail(user.getEmail());
            if (existingUser.getId() == user.getId()) {
                duplicateExists = false;
            }
        } catch (EntityNotFoundException e) {
            duplicateExists = false;
        }

        if (duplicateExists) {
            throw new DuplicateEntityException("User", "email", user.getEmail());
        }

        userRepository.update(user);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }
}
