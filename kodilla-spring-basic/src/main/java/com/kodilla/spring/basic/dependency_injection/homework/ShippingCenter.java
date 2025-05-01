package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private Delivery delivery;
    private Notification notification;

    public ShippingCenter(Delivery delivery, Notification notification) {
        this.delivery = delivery;
        this.notification = notification;
    }
    public void sendPackage(String address, double weight) {
        if (delivery.deliverPackage(address, weight)) {
            notification.success(address);
        } else {
            notification.fail(address);
        }
    }
}
