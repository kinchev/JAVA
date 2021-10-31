package com.telerikacademy.web.springdemo.repositories;

import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.Beer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class BeerRepositoryListImpl implements BeerRepository {

    private final List<Beer> beers;

    public BeerRepositoryListImpl() {
        beers = new ArrayList<>();
        beers.add(new Beer(1, "Glarus English Ale", 4.6));
        beers.add(new Beer(2, "Rhombus Porter", 5.0));
        beers.add(new Beer(3, "Opasen Char", 6.6));
    }

    @Override
    public List<Beer> getAll() {
        return beers;
    }

    @Override
    public List<Beer> filter(Optional<Integer> styleId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Beer getById(int id) {
        return beers.stream()
                .filter(beer -> beer.getId() == id)
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Beer", id));
    }

    @Override
    public Beer getByName(String name) {
        return beers.stream()
                .filter(beer -> beer.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Beer", "name", name));
    }

    @Override
    public void create(Beer beer) {
        beers.add(beer);
    }

    @Override
    public void update(Beer beer) {
        Beer beerToUpdate = getById(beer.getId());
        beerToUpdate.setName(beer.getName());
        beerToUpdate.setAbv(beer.getAbv());
    }

    @Override
    public void delete(int id) {
        Beer beerToDelete = getById(id);
        beers.remove(beerToDelete);
    }

}
