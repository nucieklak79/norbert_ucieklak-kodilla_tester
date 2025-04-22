package com.kodilla.execution_model.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        if (minValue < 0 || maxValue < 0 || minValue > maxValue) {
            System.err.println("Invalid value range.");
            return List.of();
        }
        return orders.stream()
                .filter(order -> order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue)
                .collect(Collectors.toList());
    }
    public double getTotalOrdersValue() {
        return orders.stream()
                .mapToDouble(Order::getOrderValue)
                .sum();
    }
    public void clear() {
        this.orders.clear();
    }
    public int getNumberOfOrders() {
        return this.orders.size();
    }
}
