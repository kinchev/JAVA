package com.telerikacademy.interfacesegregation.examples.solution;

import com.telerikacademy.interfacesegregation.models.Beer;

/**
 * Although this interface does not define any methods to be implemented,
 * it has a semantic meaning which is also valuable and improved the readability of the code.
 */

public interface BeerRepository extends BaseCreateRepository<Beer> {
}
