package com.telerikacademy.interfacesegregation.examples.solution;

import java.util.List;

public interface BaseRepository<T> {

    List<T> getAll();

}
