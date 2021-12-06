package com.telerikacademy.dip.examples.violation;

import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl {

    /**
     * We depend on a concrete implementation, not an abstraction, which is
     * a violation of the Dependency Inversion Principle.
     */

    private final BeerRepositoryImpl repository;

    public BeerServiceImpl() {

        /**
         * Since the class creates an instance of its dependency, it is impossible to test it.
         * If we have no control of the used implementation, we cannot isolate the
         * class under test from its dependencies.
         */

        this.repository = new BeerRepositoryImpl();
    }
}
