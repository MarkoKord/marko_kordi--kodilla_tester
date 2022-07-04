package com.kodilla.exception.homework;


import java.util.ArrayList;
import java.util.List;

public class Warehouse {


    private List<Order> orders;

    public Warehouse() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
        return;

    }

    public Order getOrder(String number) throws OrderDoesentExistException {
       return orders.stream()                                                           // po "return" zostanie zwrócone wykonanie wyniku metody
                .filter(n -> n.getNumber().equals(number))  //filtruje
                .findFirst()
                .orElseThrow(() -> new OrderDoesentExistException());


    }

    public static String getOrderNumber(Order order) {
        return order.getNumber();
    }

}

