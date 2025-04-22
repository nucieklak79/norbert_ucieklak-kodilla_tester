package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double orderValue;
    private LocalDate orderDate;
    private String login;

    public Order(double orderValue, LocalDate orderDate, String login) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.login = login;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", login='" + login + '\'' +
                '}';
    }
}
