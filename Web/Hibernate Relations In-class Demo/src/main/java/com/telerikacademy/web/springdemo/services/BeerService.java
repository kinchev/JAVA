package com.telerikacademy.web.springdemo.services;

import com.telerikacademy.web.springdemo.models.Beer;

import java.util.List;
import java.util.Optional;

public interface BeerService {

    List<Beer> getAll();

    List<Beer> filter(Optional<Integer> styleId);

    Beer getById(int id);

    void create(Beer beer);

    void update(Beer beer);
    
    void delete(int id);
    
}
