package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        Delivery myDelivery = new Delivery();
        Notification myNotification = new Notification();
        ShippingCenter shippingCenter = new ShippingCenter(myDelivery, myNotification);

        shippingCenter.sendPackage("Siewierska 19, Tarnowskie Góry", 15.0);
        shippingCenter.sendPackage("Lompy 19, Katowice", 45.0);
    }
}
