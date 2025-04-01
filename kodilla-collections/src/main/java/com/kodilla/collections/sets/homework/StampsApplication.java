package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        // Tworzenie kolekcji znaczków (HashSet)
        Set<Stamp> stamps = new HashSet<>();

        // Tworzenie znaczków
        Stamp stamp1 = new Stamp("Znaczek 1", 2.5, 3.0, false);
        Stamp stamp2 = new Stamp("Znaczek 2", 3.0, 4.0, true);
        Stamp stamp3 = new Stamp("Znaczek 1", 2.5, 3.0, false); // Duplikat stamp1
        Stamp stamp4 = new Stamp("Znaczek 3", 2.5, 3.0, true);  // Inny, ale wymiary jak stamp1

        stamps.add(stamp1);
        stamps.add(stamp2);
        stamps.add(stamp3); // Ten nie powinien się dodać, bo jest duplikatem stamp1
        stamps.add(stamp4);

        System.out.println("Rozmiar kolekcji znaczków wynosi: " + stamps.size()); // Powinno być 3

        // Wyświetlenie znaczków w kolekcji
        System.out.println("Znaczki w kolekcji:");
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

        System.out.println("\nCzy kolekcja zawiera duplikat stamp1? " + stamps.contains(stamp3)); // Powinno być true

        // Próba dodania duplikatu po raz kolejny
        boolean added = stamps.add(stamp1);
        System.out.println("Czy dodano duplikat po raz kolejny? " + added); // Powinno być false
        System.out.println("Rozmiar kolekcji po dodaniu duplikatu: " + stamps.size()); // Nadal powinno być 3
    }
}
