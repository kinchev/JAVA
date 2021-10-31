package com.telerikacademy.web.springdemo.controllers;

import com.telerikacademy.web.springdemo.exceptions.DuplicateEntityException;
import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.exceptions.UnauthorizedOperationException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.models.BeerDto;
import com.telerikacademy.web.springdemo.models.User;
import com.telerikacademy.web.springdemo.services.BeerService;
import com.telerikacademy.web.springdemo.services.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
    private final AuthenticationHelper authenticationHelper;

    @Autowired
    public BeerController(
            BeerService service,
            ModelMapper modelMapper,
            AuthenticationHelper authenticationHelper) {
        this.service = service;
        this.modelMapper = modelMapper;
        this.authenticationHelper = authenticationHelper;
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
    public Beer create(@RequestHeader HttpHeaders headers, @Valid @RequestBody BeerDto beerDto) {
        try {
            User user = authenticationHelper.tryGetUser(headers);
            Beer beer = modelMapper.fromDto(beerDto, user);
            service.create(beer);
            return beer;
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        } catch (DuplicateEntityException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public Beer update(
            @RequestHeader HttpHeaders headers,
            @PathVariable int id,
            @Valid @RequestBody BeerDto beerDto) {
        try {
            User user = authenticationHelper.tryGetUser(headers);
            Beer beer = modelMapper.fromDto(beerDto, id);
            service.update(beer, user);
            return beer;
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        } catch (DuplicateEntityException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        } catch (UnauthorizedOperationException e) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestHeader HttpHeaders headers, @PathVariable int id) {
        try {
            User user = authenticationHelper.tryGetUser(headers);
            service.delete(id, user);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        } catch (UnauthorizedOperationException e) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage());
        }
    }

}
