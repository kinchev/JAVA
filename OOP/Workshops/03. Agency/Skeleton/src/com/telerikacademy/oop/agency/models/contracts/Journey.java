package com.telerikacademy.oop.agency.models.contracts;

import com.telerikacademy.oop.agency.models.vehicles.contracts.Vehicle;

public interface Journey {

    int getDistance();

    Vehicle getVehicle();

    String getDestination();

    double calculateTravelCosts();

}