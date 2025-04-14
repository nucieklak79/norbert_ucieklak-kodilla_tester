package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("1001");
        Order order2 = new Order("1002");
        Order order3 = new Order("1003");

        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);

        try {
            Order foundOrder = warehouse.getOrder("1002");
            System.out.println("Znaleziono zamówienie: " + foundOrder.getNumber());

            Order nonExistentOrder = warehouse.getOrder("9999");
            System.out.println("Znaleziono zamówienie: " + nonExistentOrder.getNumber());
        } catch (OrderDoesntExistException e) {
            System.err.println("Wystąpił błąd: " + e.getMessage());
        }

        System.out.println("Koniec działania programu.");
    }
}
