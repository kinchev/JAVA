package com.telerikacademy.srp.examples.solution;

import com.telerikacademy.srp.models.Beer;

public interface BeerRepository {

    Beer getByName(String name);

    void create(Beer beer);

}
