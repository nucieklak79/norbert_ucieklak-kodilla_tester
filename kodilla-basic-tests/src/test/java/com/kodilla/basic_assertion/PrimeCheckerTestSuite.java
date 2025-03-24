package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    private PrimeChecker checker = new PrimeChecker();
    public static int count = 0;
    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {

        count++;
        System.out.println("Count : " + count);
        boolean result = checker.isPrime(14);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {

        count++;
        System.out.println("Count : " + count);
        boolean result = checker.isPrime(13);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {

        count++;
        System.out.println("Count : " + count);
        boolean result = checker.isPrime(2);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {

        System.out.println("Count : " + checker.getCount());
        count++;
        System.out.println("Count : " + count);
        boolean result = checker.isPrime(1);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        count++;
        System.out.println("Count : " + count);
        boolean result = checker.isPrime(0);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        count++;
        System.out.println("Count : " + count);
        boolean result = checker.isPrime(-6);
        assertFalse(result);
    }
}
