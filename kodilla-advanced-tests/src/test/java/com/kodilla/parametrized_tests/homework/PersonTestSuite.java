package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value="com.kodilla.parametrized_tests.homework.PersonBMISources#provideDataForBMITests")
    public void shouldCalculateCorrectBMICategory(double height, double weight, String expectedCategory) {
        // Given
        Person person = new Person(height, weight);

        // When
        String actualCategory = person.getBMI();

        // Then
        assertEquals(expectedCategory, actualCategory);
    }


}
