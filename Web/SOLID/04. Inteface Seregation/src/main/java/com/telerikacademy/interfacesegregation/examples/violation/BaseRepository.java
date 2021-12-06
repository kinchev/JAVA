package com.telerikacademy.interfacesegregation.examples.violation;

import java.util.List;

public interface BaseRepository<T> {

    void create(T t);

    List<T> getAll();

}
