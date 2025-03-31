package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Mazda{" +
                "speed=" + speed +
                ", make='" + make + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mazda mazda = (Mazda) o;
        return speed == mazda.speed && Objects.equals(make, mazda.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, make);
    }
}
