package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(orderValue, order.orderValue) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, orderDate, login);
    }
}
