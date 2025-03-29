package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed = 0;
    private String make = "Ford";

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
        speed+=10;
    }

    @Override
    public void decreaseSpeed() {
        speed-=5;
    }
}
