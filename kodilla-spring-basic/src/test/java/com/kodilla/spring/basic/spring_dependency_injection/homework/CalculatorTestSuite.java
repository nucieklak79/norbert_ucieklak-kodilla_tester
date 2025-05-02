package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        //Given
        double a = 10.5;
        double b = 5.2;
        double expected = 15.7;
        //When
        double result = calculator.add(a, b);
        //Then
        assertEquals(expected, result, 0.001);

    }
    @Test
    void testSubtract() {
        //Given
        double a = 10.5;
        double b = 5.2;
        double expected = 5.3;
        //When
        double result = calculator.subtract(a, b);
        //Then
        assertEquals(expected, result, 0.001);
    }

    @Test
    void testMultiply() {
        //Given
        double a = 10.5;
        double b = 5.0;
        double expected = 52.5;
        //When
        double result = calculator.multiply(a, b);
        //Then
        assertEquals(expected, result, 0.001);
    }

    @Test
    void testDivide() {
        //Given
        double a = 10.0;
        double b = 2.0;
        double expected = 5.0;
        //When
        double result = calculator.divide(a, b);
        //Then
        assertEquals(expected, result, 0.001);
    }

    @Test
    void testDivideByZero() {
        //Given
        double a = 10.0;
        double b = 0.0;
        //When
           double result = calculator.divide(a, b);
        //Then
        assertEquals("Infinity", String.valueOf(result));
    }
}
