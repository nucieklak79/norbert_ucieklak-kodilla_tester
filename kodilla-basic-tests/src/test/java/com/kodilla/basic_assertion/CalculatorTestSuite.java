package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        // When
        int sumResult = calculator.sum(a, b);
        // Then
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        // Given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        // When
        int subtractResult = calculator.subtract(a, b);
        // Then
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquarePositive() {
        // Given
        Calculator calculator = new Calculator();
        int a = 5;
        // When
        int squarePositiveResult = (int) calculator.square(5);
        // Then
        assertEquals(25, squarePositiveResult);
    }

    @Test
    public void testSquareNegative() {
        // Given
        Calculator calculator = new Calculator();
        int a = -5;
        // When
        int squareNegativeResult = (int) calculator.square(a);
        // Then
        assertEquals(25, squareNegativeResult);
    }

    @Test
    public void testSquareZero() {
        // Given
        Calculator calculator = new Calculator();
        int a = 0;
        // When
        int squareZeroResult = (int) calculator.square(a);
        // Then
        assertEquals(0, squareZeroResult);
    }

    @Test
    public void testSquareDouble() {
        // Given
        Calculator calculator = new Calculator();
        double a = 1.5;
        double delta = 0.0001;
        // When
        double squareDoubleResult = calculator.square(a);
        // Then
        assertEquals(2.25, squareDoubleResult, delta); // Delta = 0.001
    }
}