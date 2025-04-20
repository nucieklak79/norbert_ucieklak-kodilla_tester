package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/gamble_test_data.csv")
    void testHowManyWins(String userNumbersString, int expectedWins) {
        // Given
        GamblingMachine lotto = new GamblingMachine();
        Set<Integer> userNumbers = parseUserNumbers(userNumbersString);

        // When
        int actualWins = 0;
        try {
            actualWins = lotto.howManyWins(userNumbers);
        } catch (InvalidNumbersException e) {
            org.junit.jupiter.api.Assertions.fail("Unexpected error: " + e.getMessage());
        }

        // Then
        assertEquals(expectedWins, actualWins);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamble_invalid_data.csv")
    void testHowManyWins_invalidInput(String userNumbersString) {
        // Given
        GamblingMachine lotto = new GamblingMachine();
        Set<Integer> userNumbers = parseUserNumbers(userNumbersString);

        // When & Then
        assertThrows(InvalidNumbersException.class, () -> lotto.howManyWins(userNumbers));
    }

    private Set<Integer> parseUserNumbers(String numbersString) {
        Set<Integer> numbers = new HashSet<>();
        String[] numberStrings = numbersString.split(",");
        for (String numberString : numberStrings) {
            numbers.add(Integer.parseInt(numberString.trim()));
        }
        return numbers;
    }
}