package com.kodilla.spring.basic.homework;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService {
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            return false;
        }
        return true;
    }
}
