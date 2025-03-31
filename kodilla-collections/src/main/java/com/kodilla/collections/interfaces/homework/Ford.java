package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {
    private int speed = 0;
    private final String make = "Ford";

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

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                ", make='" + make + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed && Objects.equals(make, ford.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, make);
    }
}
