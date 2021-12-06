package com.telerikacademy.interfacesegregation.examples.solution;

public interface BaseCreateRepository<T> extends BaseRepository<T> {

    void create(T t);

}
