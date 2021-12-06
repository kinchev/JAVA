package com.telerikacademy.dip.examples.violation;

import com.telerikacademy.dip.models.Beer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BeerRepositoryImpl {

    public List<Beer> getAll() {
        return List.of(new Beer());
    }

}
