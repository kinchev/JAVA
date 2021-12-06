package com.telerikacademy.srp.examples.solution;

import com.telerikacademy.srp.exceptions.DuplicateEntityException;
import com.telerikacademy.srp.models.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/beers")
public class BeerMvcController {

    /**
     * This is more like it.
     * <p>
     * The class is only responsible for handling user interactions, and it delegates everything else
     * to a service layer (which delegates handling accessing/modifying a repository).
     */

    private final BeerService service;

    @Autowired
    public BeerMvcController(BeerService service) {
        this.service = service;
    }

    @GetMapping
    public String showCreateBeerPage(Model model) {
        model.addAttribute("newBeer", new Beer());
        return "createBeer";
    }

    @PostMapping
    public String handleCreateBeer(@ModelAttribute("newBeer") Beer beer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "createBeer";
        }

        try {
            service.create(beer);
            return "success";
        } catch (DuplicateEntityException e) {
            bindingResult.rejectValue("name", "duplicate_name", e.getMessage());
            return "createBeer";
        }
    }

}
