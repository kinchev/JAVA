package com.telerikacademy.web.springdemo.controllers;

import com.telerikacademy.web.springdemo.exceptions.DuplicateEntityException;
import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/beers")
public class BeerController {

    private final BeerService service;

    @Autowired
    public BeerController(BeerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Beer> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Beer getById(@PathVariable int id) {
        try {
            return service.getById(id);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @PostMapping
    public Beer create(@Valid @RequestBody Beer beer) {
        try {
            service.create(beer);
        } catch (DuplicateEntityException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
        return beer;
    }

    @PutMapping("/{id}")
    public Beer update(@PathVariable int id, @Valid @RequestBody Beer beer) {
        try {
            service.update(beer);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        } catch (DuplicateEntityException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
        return beer;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        try {
            service.delete(id);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

}
