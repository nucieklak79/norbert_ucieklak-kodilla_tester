package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Gdańsk"));
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Gdańsk", "Wrocław"));
        flights.add(new Flight("Kraków", "Berlin"));
        flights.add(new Flight("Berlin", "Londyn"));
        flights.add(new Flight("Londyn", "Warszawa"));
        flights.add(new Flight("Wrocław", "Warszawa"));
        return flights;
    }
}
