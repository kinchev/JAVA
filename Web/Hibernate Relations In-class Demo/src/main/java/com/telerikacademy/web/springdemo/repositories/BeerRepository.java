package com.telerikacademy.web.springdemo.repositories;

import com.telerikacademy.web.springdemo.models.Beer;

import java.util.List;
import java.util.Optional;

public interface BeerRepository {

    List<Beer> getAll();

    List<Beer> filter(Optional<Integer> styleId);
    
    Beer getById(int id);
    
    Beer getByName(String name);

    void create(Beer beer);

    void update(Beer beer);
    
    void delete(int id);
    
}
