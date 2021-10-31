package com.telerikacademy.web.springdemo.models;

import java.time.LocalDate;
import java.util.Date;

public class Shipment {

    LocalDate arrivalDate;

    LocalDate departureDate;

    Enum status;

    public Enum getStatus() {
        calculateStatus();
        return this.status;
    }

    private void calculateStatus(){
        LocalDate now = LocalDate.now();
        if (now.isAfter(arrivalDate)){
        //    status = Enum.delivered;
        }

    }
}
