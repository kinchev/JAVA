package com.telerikacademy.dip.examples.solution;

import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl {

    /**
     * We depend on an abstraction, which is in
     * accordance with the Dependency Inversion Principle.
     */

    private final BeerRepository repository;

    /**
     * The class receives an instance of its dependency via the constructor,
     * instead of instantiating it itself. Using the approach we can swap
     * implementations or provide different implementations, depending on the context.
     * We can use a real class that connects to a real database while the application
     * is running and provide a mock implementation while testing.
     */

    public BeerServiceImpl(BeerRepository repository) {
        this.repository = repository;
    }
}
