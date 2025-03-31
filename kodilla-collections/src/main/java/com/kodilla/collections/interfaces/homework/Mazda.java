package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car {
    private int speed = 0;
    private final String make = "Mazda";

    @Override
    public String getCarMake() {
        return make;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed+=20;
    }

    @Override
    public void decreaseSpeed() {
        speed-=8;
    }
}
