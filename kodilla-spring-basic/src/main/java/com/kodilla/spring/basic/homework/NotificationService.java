package com.kodilla.spring.basic.homework;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public String success(String address) {
    return "Package delivered to: " + address;
}

    public String fail(String address) {
        return "Package not delivered to: " + address;
    }
}
