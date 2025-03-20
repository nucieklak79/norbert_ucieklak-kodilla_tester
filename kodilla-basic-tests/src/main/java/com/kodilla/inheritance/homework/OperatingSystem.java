package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void turnOn() {
        System.out.println("System operacyjny włączony.");
    }

    public void turnOff() {
        System.out.println("System operacyjny wyłączony.");
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}