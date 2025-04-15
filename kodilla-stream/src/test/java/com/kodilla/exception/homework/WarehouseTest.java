package com.kodilla.exception.homework;

import com.kodilla.exception.homework.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {
    @Test
    void testGetOrder_orderExists() {
        // Given
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("123");
        Order order2 = new Order("456");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);

        // When
        Order result = null;
        try {
            result = warehouse.getOrder("123");
        } catch (OrderDoesntExistException e) {

            fail("Nieoczekiwany wyjątek: " + e.getMessage());
        }

        // Then
       assertEquals(order1, result);
    }

    @Test
    void testGetOrder_orderDoesNotExist() {
        // Given
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("123");
        Order order2 = new Order("456");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);

        // When
        // Then
       assertThrows(OrderDoesntExistException.class, () -> {
            warehouse.getOrder("789");
        });
    }
}
