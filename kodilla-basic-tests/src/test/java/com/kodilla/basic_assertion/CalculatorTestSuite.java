package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquarePositive() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.square(5));
    }

    @Test
    public void testSquareNegative() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.square(-5));
    }

    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.square(0));
    }

    @Test
    public void testSquareDouble() {
        Calculator calculator = new Calculator();
        assertEquals(2.25, calculator.square(1.5), 0.001); // Delta = 0.001
    }
}