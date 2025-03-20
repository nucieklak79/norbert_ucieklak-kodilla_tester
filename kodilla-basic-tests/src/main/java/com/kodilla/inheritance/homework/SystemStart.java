package com.kodilla.inheritance.homework;

public class SystemStart {
    public static void main(String[] args) {
        OperatingSystem os1 = new Windows(2021);
        OperatingSystem os2 = new Linux(2023);

        os1.turnOn();
        os1.turnOff();

        os2.turnOn();
        os2.turnOff();

        System.out.println("Rok wydania Windows: " + os1.getReleaseYear());
        System.out.println("Rok wydania Linux: " + os2.getReleaseYear());
    }
}