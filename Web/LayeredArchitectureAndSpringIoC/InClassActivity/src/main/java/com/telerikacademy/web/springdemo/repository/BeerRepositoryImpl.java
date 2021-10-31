package com.telerikacademy.web.springdemo.repository;

import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.models.Style;

import java.util.ArrayList;
import java.util.List;

public class BeerRepositoryImpl implements BeerRepository {
    private final List<Beer> beers;

    public BeerRepositoryImpl() {

        beers = new ArrayList<>();

        Style style1 = new Style(1, "Porter");
        Style style2 = new Style(2, "Ale");

        beers.add(new Beer(1, "Glarus English Ale", 4.6, style2));
        beers.add(new Beer(2, "Rhombus Porter", 5.0, style1));
        beers.add(new Beer(3, "Opasen Char", 6.6, style1));
    }




    @Override
    public List<Beer> getAll(String name, String style, String sortBy, String sortOrder) {
return  null;
    }

    @Override
    public Beer getById(int id) {
        return null;
    }

    @Override
    public void create(Beer beer) {

    }

    @Override
    public void update(int id, Beer beer) {

    }

    @Override
    public void delete(int id) {

    }
}
