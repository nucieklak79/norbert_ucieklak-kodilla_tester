package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mazda;
import java.util.Random;

public class CarsApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = getRandomCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car getRandomCar() {
        int drawRandomCarObject = RANDOM.nextInt(3);

        if (drawRandomCarObject == 0) return new Ford();
        else if (drawRandomCarObject == 1) return new Opel();
        else return new Mazda();

    }
}

