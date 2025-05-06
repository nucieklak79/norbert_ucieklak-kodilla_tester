package com.kodilla.spring.basic.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }
    public double add(double a, double b) {
        double result = a + b;
        display.display(result);
        return result;

    }
    public double subtract(double a, double b) {
        double result = a - b;
        display.display(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        display.display(result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
        }
        double result = a / b;
        display.display(result);
        return result;
    }
}
