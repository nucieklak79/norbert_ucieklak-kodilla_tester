package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {
    private int speed = 0;
    private String make = "Opel";

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

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                ", make='" + make + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed && Objects.equals(make, opel.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, make);
    }
}
