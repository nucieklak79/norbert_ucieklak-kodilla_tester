package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed = 0;
    private final String make = "Opel";

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
        speed+=15;

    }
    @Override
    public void decreaseSpeed() {
        speed-=7;
    }
}
