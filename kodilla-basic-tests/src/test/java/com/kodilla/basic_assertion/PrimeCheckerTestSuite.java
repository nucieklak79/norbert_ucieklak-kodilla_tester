package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    private PrimeChecker checker = new PrimeChecker();

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        // Given
        int a = 14;
        // When
        boolean result = checker.isPrime(14);
        // Then
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        // Given
        int a = 13;
        // When
        boolean result = checker.isPrime(13);
        // Then
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        // Given
        int a = 2;
        // When
        boolean result = checker.isPrime(2);
        // Then
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        // Given
        int a = 1;
        // When
        boolean result = checker.isPrime(1);
        // Then
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        // Given
        int a = 0;
        // When
        boolean result = checker.isPrime(0);
        // Then
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        // Given
        int a = -6;
        // When
        boolean result = checker.isPrime(-6);
        // Then
        assertFalse(result);
    }
}
