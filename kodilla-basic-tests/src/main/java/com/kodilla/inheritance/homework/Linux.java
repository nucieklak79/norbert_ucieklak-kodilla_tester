package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("System Linux włączony.");
    }

    @Override
    public void turnOff() {
        System.out.println("System Linux wyłączony.");
    }
}