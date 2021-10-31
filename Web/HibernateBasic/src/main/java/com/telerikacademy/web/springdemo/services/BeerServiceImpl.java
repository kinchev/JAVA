package com.telerikacademy.web.springdemo.services;

import com.telerikacademy.web.springdemo.exceptions.DuplicateEntityException;
import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {
    private final BeerRepository repository;

    @Autowired
    public BeerServiceImpl(BeerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Beer> getAll() {
        return repository.getAll();
    }

    @Override
    public Beer getById(int id) {
        return repository.getById(id);
    }

    @Override
    public void create(Beer beer) {
        boolean duplicateExists = true;
        try {
            repository.getByName(beer.getName());
        } catch (EntityNotFoundException e) {
            duplicateExists = false;
        }

        if (duplicateExists) {
            throw new DuplicateEntityException("Beer", "name", beer.getName());
        }

        repository.create(beer);
    }

    @Override
    public void update(Beer beer) {
        boolean duplicateExists = true;
        try {
            Beer existingBeer = repository.getByName(beer.getName());
            if (existingBeer.getId() == beer.getId()) {
                duplicateExists = false;
            }
        } catch (EntityNotFoundException e) {
            duplicateExists = false;
        }

        if (duplicateExists) {
            throw new DuplicateEntityException("Beer", "name", beer.getName());
        }

        repository.update(beer);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

}
