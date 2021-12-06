package com.telerikacademy.srp.examples.violation;

import com.telerikacademy.srp.models.Beer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Controller
@RequestMapping("/beers")
public class BeerMvcController {

    /**
     * There is way too much going on in this class. It has way too many responsibilities.
     * First of all it's a controller - it receives and processes requests. Then,
     * it is a service - it applies the business logic (preforms validation). It's also
     * a repository - reads and writes to the database.
     * <p>
     * This class know too much about creating a Beer. A little change can cause a ripple effect.
     * Not to mention that it is nearly impossible to test.
     */

    private final SessionFactory sessionFactory;

    @Autowired
    public BeerMvcController(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
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

        boolean duplicateExists = true;
        try {
            this.getByName(beer.getName());
        } catch (EntityNotFoundException e) {
            duplicateExists = false;
        }

        if (duplicateExists) {
            bindingResult.rejectValue("name", "duplicate_name", "Duplicate name.");
            return "createBeer";
        }

        this.create(beer);
        return "success";
    }

    private Beer getByName(String name) {
        try (Session session = sessionFactory.openSession()) {
            Query<Beer> query = session.createQuery("from Beer where name = :name", Beer.class);
            query.setParameter("name", name);

            List<Beer> result = query.list();
            if (result.size() == 0) {
                throw new EntityNotFoundException();
            }

            return result.get(0);
        }
    }

    private void create(Beer beer) {
        try (Session session = sessionFactory.openSession()) {
            session.save(beer);
        }
    }
}
