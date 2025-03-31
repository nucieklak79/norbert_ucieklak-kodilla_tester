package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car mazda = new Mazda();
        cars.add(mazda);
        cars.add(new Opel());
        cars.add(new Mazda());
        cars.add(new Ford());
        cars.add(new Opel());

        System.out.println("Kolekcja samochodów zawiera: " + cars.size() + " elementy(ów).");

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(0);
        cars.remove(mazda);

        System.out.println("Kolekcja samochodów zawiera: " + cars.size() + " elementy(ów).");
    }
}
