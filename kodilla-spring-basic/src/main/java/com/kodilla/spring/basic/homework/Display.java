package com.kodilla.spring.basic.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public void display(double value) {
        System.out.println("Returned value: " + value);
    }
}
