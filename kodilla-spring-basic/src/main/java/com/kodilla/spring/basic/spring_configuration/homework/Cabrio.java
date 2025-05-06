package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime now = LocalTime.now();
        return now.isAfter(LocalTime.of(19, 59)) || now.isBefore(LocalTime.of(6, 1));
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
