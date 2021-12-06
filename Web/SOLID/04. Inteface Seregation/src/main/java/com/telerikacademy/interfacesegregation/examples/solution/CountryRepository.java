package com.telerikacademy.interfacesegregation.examples.solution;


import com.telerikacademy.interfacesegregation.models.Country;

/**
 * Although this interface does not define any methods to be implemented,
 * it has a semantic meaning which is also valuable and improved the readability of the code.
 */

public interface CountryRepository extends BaseRepository<Country> {
}
