package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.homework.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    void testFindFlightsFrom() {
        // Given
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        // When
        List<Flight> result = flightFinder.findFlightsFrom("Warszawa");

        // Then
        assertEquals(2, result.size());
        assertEquals("Warszawa", result.get(0).getDeparture());
        assertEquals("Warszawa", result.get(1).getDeparture());
    }

    @Test
    void testFindFlightsTo() {
        // Given
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        // When
        List<Flight> result = flightFinder.findFlightsTo("Warszawa");

        // Then
        assertEquals(2, result.size());
        assertEquals("Warszawa", result.get(0).getArrival());
        assertEquals("Warszawa", result.get(1).getArrival());
    }

    @Test
        // na liście lotów jest tylko jeden lot z Berlina, a "expected" ustaliłem na "0", więc test sie nie wykona !
    void testFindFlightsFrom_noFlights() {
        // Given
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        // When
        List<Flight> result = flightFinder.findFlightsFrom("Berlin");

        // Then
        assertEquals(0, result.size());

    }

    @Test
        // na liście lotów jest jeden lot do Gdańska, przy "expected" ustalonym na "1" test sie wykona !
    void testFindFlightsTo_noFlights() {
        // Given
        List<Flight> flights = FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);

        // When
        List<Flight> result = flightFinder.findFlightsTo("Gdańsk");

        // Then
       assertEquals(1, result.size());
    }

}
