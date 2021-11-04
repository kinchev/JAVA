package com.telerikacademy.web.springdemo.controllers.mvc;

import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/beers")
public class BeerMvcController {

    private final BeerService beerService;

    @Autowired
    public BeerMvcController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping
    public String showAllBeers(Model model) {
        model.addAttribute("beers", beerService.getAll());
        return "beers";
    }

    @GetMapping("/{id}")
    public String showSingleBeer(@PathVariable int id, Model model) {
        try {
            Beer beer = beerService.getById(id);
            model.addAttribute("beer", beer);
            return "beer";
        } catch (EntityNotFoundException e) {
            model.addAttribute("error", e.getMessage());
            return "not-found";
        }
    }

}
