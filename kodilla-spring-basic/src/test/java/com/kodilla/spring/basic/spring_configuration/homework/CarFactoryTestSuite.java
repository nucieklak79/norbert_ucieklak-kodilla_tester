package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarFactoryTestSuite {

    @Test
    void testCarTypeBasedOnSeason() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarFactory.class);
        Car car = context.getBean(Car.class);

        String carType = car.getCarType();
        System.out.println("Current car type: " + carType);

        assertTrue(
                carType.equals("SUV") ||
                        carType.equals("Cabrio") ||
                        carType.equals("Sedan")
        );
    }

    @Test
    void testHeadlightsTurnedOn() {
        SUV suv = new SUV();
        Cabrio cabrio = new Cabrio();
        Sedan sedan = new Sedan();

        System.out.println("SUV headlights: " + suv.hasHeadlightsTurnedOn());
        System.out.println("Cabrio headlights: " + cabrio.hasHeadlightsTurnedOn());
        System.out.println("Sedan headlights: " + sedan.hasHeadlightsTurnedOn());

        assertNotNull(suv.hasHeadlightsTurnedOn());
        assertNotNull(cabrio.hasHeadlightsTurnedOn());
        assertNotNull(sedan.hasHeadlightsTurnedOn());
    }
}
