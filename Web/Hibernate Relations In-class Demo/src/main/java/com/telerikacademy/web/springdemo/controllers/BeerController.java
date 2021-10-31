package com.telerikacademy.web.springdemo.controllers;

import com.telerikacademy.web.springdemo.exceptions.DuplicateEntityException;
import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.models.BeerDto;
import com.telerikacademy.web.springdemo.services.BeerService;
import com.telerikacademy.web.springdemo.services.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/beers")
public class BeerController {

    private final BeerService service;
    private final ModelMapper modelMapper;

    @Autowired
    public BeerController(BeerService service, ModelMapper modelMapper) {
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<Beer> getAll() {

        return service.getAll();
    }

    @GetMapping("/filter")
    public List<Beer> filter(@RequestParam(required = false) Optional<Integer> styleId) {
        return service.filter(styleId);
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
    public Beer create(@Valid @RequestBody BeerDto beerDto) {
        try {
            Beer beer = modelMapper.fromDto(beerDto);
            service.create(beer);
            return beer;
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        } catch (DuplicateEntityException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public Beer update(@PathVariable int id, @Valid @RequestBody BeerDto beerDto) {
        try {
            Beer beer = modelMapper.fromDto(beerDto, id);
            service.update(beer);
            return beer;
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        } catch (DuplicateEntityException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
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
