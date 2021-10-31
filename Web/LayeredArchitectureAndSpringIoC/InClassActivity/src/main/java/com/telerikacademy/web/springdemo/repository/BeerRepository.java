package com.telerikacademy.web.springdemo.repository;

import com.telerikacademy.web.springdemo.models.Beer;

import java.util.List;

public interface BeerRepository {
    List<Beer> getAll(String name, String style, String sortBy, String sortOrder);

    Beer getById(int id);

    void create(Beer beer);

    void update(int id, Beer beer);

    void delete(int id);

}
