package com.telerikacademy.web.springdemo.controllers;

import com.telerikacademy.web.springdemo.models.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/beers")
public class BeerController {
    
    private final List<Beer> beers;
    
    public BeerController() {
        beers = new ArrayList<>();
        
        beers.add(new Beer(1, "Glarus English Ale", 4.6));
        beers.add(new Beer(2, "Rhombus Porter", 5.0));
    }

    @GetMapping
    public List<Beer> getAll(@RequestParam(required = false) Optional<String> name,
                             @RequestParam(required = false) Optional<Double> minAbv,
                             @RequestParam(required = false) Optional<Double> maxAbv) {
        return beers.stream()
                .filter(beer -> name.isEmpty() || beer.getName().toLowerCase().contains(name.get().toLowerCase()))
                .filter(beer -> minAbv.isEmpty() || beer.getAbv() >= minAbv.get())
                .filter(beer -> maxAbv.isEmpty() || beer.getAbv() <= maxAbv.get())
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Beer getById(@PathVariable int id) {
        return getByIdHelper(id);
    }

    @PostMapping
    public Beer create(@Valid @RequestBody Beer beer) {
        beers.add(beer);
        return beer;
    }

    @PutMapping("/{id}")
    public Beer update(@PathVariable int id, @Valid @RequestBody Beer beer) {
        Beer beerToUpdate = getByIdHelper(id);
        
        beerToUpdate.setName(beer.getName());
        beerToUpdate.setAbv(beer.getAbv());
        
        return beerToUpdate;
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        Beer beerToDelete = getByIdHelper(id);
        beers.remove(beerToDelete);
    }
    
    private Beer getByIdHelper(int id) {
        return beers.stream()
                .filter(beer -> beer.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        String.format("Beer with id %d not found.", id)));
    }
}
