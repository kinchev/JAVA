package com.telerikacademy.web.springdemo.models;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    private String name;

    public Adress() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
