package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mazda;
import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {
        Random randomSpeedIncrease = new Random();
        System.out.println("-----------------------------");
        System.out.println("Car make: " + getCarBrand(car));
        for (int i = 0; i < randomSpeedIncrease.nextInt(30); i++) {
            car.increaseSpeed();
        }
        System.out.println(" Car speed: " + car.getSpeed());
    }

    public static String getCarBrand(Car car) {
        return car.getCarMake();
    }
}
