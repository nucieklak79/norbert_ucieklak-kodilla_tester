package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {
    @Test
    void shouldBeLeapYearIfDivisibleBy400() {
        //Given
        Year year = new Year(1600);
        //When
        boolean isLeapYear = year.isLeap();
        //Then
        assertTrue(isLeapYear);
    }
    @Test
    void shouldBeLeapYearDivisibleBy4AndNot100() {
        //Given
        Year year = new Year(2024);
        //When
        boolean isLeapYear = year.isLeap();
        //Then
        assertTrue(isLeapYear);

    }
    @Test
    void shouldNotBeLeapYearDivisibleBy100ButNot400() {
        //Given
        Year year = new Year(1900);
        //When
        boolean isLeapYear = year.isLeap();
        //Then
        assertFalse(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearNotDivisibleBy4() {
        //Given
        Year year = new Year(2023);
        //When
        boolean isLeapYear = year.isLeap();
        //Then
        assertFalse(isLeapYear);
    }
}
