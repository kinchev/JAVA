package com.telerikacademy.srp.examples.solution;

import com.telerikacademy.srp.exceptions.DuplicateEntityException;
import com.telerikacademy.srp.exceptions.EntityNotFoundException;
import com.telerikacademy.srp.models.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository repository;

    @Autowired
    public BeerServiceImpl(BeerRepository repository) {
        this.repository = repository;
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
            throw new DuplicateEntityException();
        }

        repository.create(beer);
    }

}
