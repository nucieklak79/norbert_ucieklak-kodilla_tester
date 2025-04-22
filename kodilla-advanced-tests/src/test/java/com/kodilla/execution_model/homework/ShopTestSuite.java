package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {
    private Shop shop;
    private Order order1;
    private Order order2;
    private Order order3;
    private Order order4; // Duplicate order1
    private Order order5;
    private Order order6; // Value = zero


    @BeforeEach
    void setUp() {

        shop = new Shop();

        order1 = new Order(150.50, LocalDate.of(2025, 4, 20), "user1");
        order2 = new Order(75.00, LocalDate.of(2025, 4, 21), "user2");
        order3 = new Order(200.00, LocalDate.of(2025, 4, 22), "user1");
        order4 = new Order(150.50, LocalDate.of(2025, 4, 20), "user1"); // same as order1
        order5 = new Order(50.25, LocalDate.of(2025, 4, 23), "user3");
        order6 = new Order(0.00, LocalDate.of(2025, 4, 24), "user4");
    }

    @Test
    void testEmptyShopInitialization() {
        assertEquals(0, shop.getNumberOfOrders());
        assertEquals(0.0, shop.getTotalOrdersValue(), 0.001);
        assertTrue(shop.getOrdersByValueRange(0.0, Double.MAX_VALUE).isEmpty());
    }

    @Test
    void testAddUniqueOrders() {
        shop.addOrder(order1);
        assertEquals(1, shop.getNumberOfOrders());
        assertEquals(150.50, shop.getTotalOrdersValue(), 0.001);

        shop.addOrder(order2);
        assertEquals(2, shop.getNumberOfOrders());
        assertEquals(225.50, shop.getTotalOrdersValue(), 0.001); // 150.50 + 75.00

       shop.addOrder(order6);
        assertEquals(3, shop.getNumberOfOrders());
        assertEquals(225.50, shop.getTotalOrdersValue(), 0.001); // 225.50 + 0.00
    }

    @Test
    void testAddDuplicateOrder() {
        shop.addOrder(order1); // Adding first order
        shop.addOrder(order4);
        assertEquals(1, shop.getNumberOfOrders());
        assertEquals(150.50, shop.getTotalOrdersValue(), 0.001);
    }

    @Test
    void testAddNullOrder() {
        shop.addOrder(null);
        assertEquals(0, shop.getNumberOfOrders());
        assertEquals(0.0, shop.getTotalOrdersValue(), 0.001);
    }

    @Test
    void testGetOrdersByValueRange_SomeMatch() {
        shop.addOrder(order1); shop.addOrder(order2); shop.addOrder(order3); shop.addOrder(order5); shop.addOrder(order6);
        List<Order> result = shop.getOrdersByValueRange(50.00, 100.00);
        assertEquals(2, result.size());
        assertTrue(result.containsAll(List.of(order2, order5)));
    }

    @Test
    void testGetOrdersByValueRange_BoundaryValues() {
        shop.addOrder(order1); shop.addOrder(order2); shop.addOrder(order3); shop.addOrder(order5); shop.addOrder(order6);

        List<Order> result = shop.getOrdersByValueRange(75.00, 150.50);
        assertEquals(2, result.size());
        assertTrue(result.containsAll(List.of(order1, order2)));
    }

    @Test
    void testGetOrdersByValueRange_ZeroValue() {
        shop.addOrder(order1); shop.addOrder(order2); shop.addOrder(order6);
        List<Order> result = shop.getOrdersByValueRange(0.00, 50.00);
        assertEquals(1, result.size());
        assertTrue(result.contains(order6));
    }

    @Test
    void testGetOrdersByValueRange_NoMatch() {
        shop.addOrder(order1); shop.addOrder(order2); shop.addOrder(order3);
        List<Order> result = shop.getOrdersByValueRange(1000.00, 2000.00);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetOrdersByValueRange_InvalidRange() {
        shop.addOrder(order1); shop.addOrder(order2);
        List<Order> result = shop.getOrdersByValueRange(100.00, 50.00);
        assertTrue(result.isEmpty());
    }

    @Test
    void testTotalOrdersValue() {
        shop.addOrder(order1); shop.addOrder(order2); shop.addOrder(order3); shop.addOrder(order5); shop.addOrder(order6);
        // Sum: 150.50 + 75.00 + 200.00 + 50.25 + 0.00 = 475.75
        assertEquals(475.75, shop.getTotalOrdersValue(), 0.001);
    }

    @Test
    void testGetNumberOfOrders() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4); // Trying to add a duplicate order1
        shop.addOrder(order5);
        assertEquals(4, shop.getNumberOfOrders()); // order1, order2, order3, order5
    }
}
