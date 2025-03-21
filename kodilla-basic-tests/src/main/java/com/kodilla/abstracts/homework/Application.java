package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(5);
        System.out.println("Kwadrat - pole: " + square.getArea() + ", obwód: " + square.getPerimeter());

        Shape circle = new Circle(3);
        System.out.println("Koło - pole: " + circle.getArea() + ", obwód: " + circle.getPerimeter());

        Shape triangle = new Triangle(3, 4, 5, 2.4);
        System.out.println("Trójkąt - pole: " + triangle.getArea() + ", obwód: " + triangle.getPerimeter());
    }
}
