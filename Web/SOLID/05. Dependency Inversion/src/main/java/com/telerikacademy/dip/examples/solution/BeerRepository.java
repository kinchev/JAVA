package com.telerikacademy.dip.examples.solution;


import com.telerikacademy.dip.models.Beer;

import java.util.List;

/**
 * We define an interface (contract) that says - "Every Beer Repository that implements me
 * will provide the following functionality".
 */

public interface BeerRepository {
    List<Beer> getAll();
}
