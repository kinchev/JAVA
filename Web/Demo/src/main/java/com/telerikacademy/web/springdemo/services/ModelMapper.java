package com.telerikacademy.web.springdemo.services;

import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.models.BeerDto;
import com.telerikacademy.web.springdemo.models.Style;
import com.telerikacademy.web.springdemo.models.User;
import com.telerikacademy.web.springdemo.repositories.BeerRepository;
import com.telerikacademy.web.springdemo.repositories.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModelMapper {

    private final BeerRepository beerRepository;
    private final StyleRepository styleRepository;

    @Autowired
    public ModelMapper(BeerRepository beerRepository, StyleRepository styleRepository) {
        this.beerRepository = beerRepository;
        this.styleRepository = styleRepository;
    }

    public Beer fromDto(BeerDto beerDto, User user) {
        Beer beer = new Beer();
        dtoToObject(beerDto, beer);
        beer.setCreatedBy(user);
        return beer;
    }

    public Beer fromDto(BeerDto beerDto, int id) {
        Beer beer = beerRepository.getById(id);
        dtoToObject(beerDto, beer);
        return beer;
    }

    private void dtoToObject(BeerDto beerDto, Beer beer) {
        Style style = styleRepository.getById(beerDto.getStyleId());
        beer.setName(beerDto.getName());
        beer.setAbv(beerDto.getAbv());
        beer.setStyle(style);
    }

}
