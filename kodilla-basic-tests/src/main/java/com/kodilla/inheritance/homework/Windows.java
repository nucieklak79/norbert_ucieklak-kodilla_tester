package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("System Windows włączony.");
    }

    @Override
    public void turnOff() {
        System.out.println("System Windows wyłączony.");
    }
}