package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * height;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
