package com.kodilla.execution_model.homework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(1500, LocalDate.of(2012, 6, 10), "darek");
    Order order2 = new Order(100, LocalDate.of(2012, 7, 9), "stefan");
    Order order3 = new Order(2000, LocalDate.of(2012, 6, 22), "kasia");
    Order order4 = new Order(150, LocalDate.of(2012, 9, 11), "radek");
    Order order5 = new Order(20, LocalDate.of(2012, 9, 10), "ania");

    @BeforeEach
    public void addOrders() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
}
    @Test
    public void shouldAddNewOrder() {
        shop.addOrder(new Order(100, LocalDate.of(2012, 7, 9), "kuba"));

        int result = shop.getNumberOfOrders();

        assertEquals(6, result);

    }

        @Test
    public void shouldReturnOrderBetweenTwoDates() {
        List<Order> DataTest = shop.getOrdersFromDate(LocalDate.of (2010, 6, 10), LocalDate.of(2012,6,15));

        assertEquals(1, DataTest.size());

    }
    @Test
    public void shouldReturnOrderInValueRange() {
        List<Order> highestOrder = shop.getHighestAndLowestOrder(2000, 1600);

        assertEquals(1, highestOrder.size());
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        int result = shop.getNumberOfOrders();
        assertEquals(5, result);
    }
    @Test
    public void shouldReturnTotalValueOfAllOrders() {
        shop.getSumOfValues();
        assertEquals(3770, shop.getSumOfValues());
    }


    }












