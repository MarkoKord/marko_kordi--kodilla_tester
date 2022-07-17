package com.kodilla.execution_model.homework;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {                                          //dodanie nowego zamówienia
        this.orders.add(order);
    }

    public List<Order> getOrdersFromDate(LocalDate from, LocalDate to) {         //zwrocenie listy z przedzialu dwoch dat
        return orders.stream()
                .filter(c -> c.getData().isAfter(from) && c.getData().isBefore(to))
                .collect(Collectors.toList());
    }

    public List<Order> getHighestAndLowestOrder(double highest, double lowest) {    //zwrocenenie najwyzeszego i najnizszej wartosci
        return orders.stream()
                .filter(c -> c.getValues() >= lowest & c.getValues() >= highest)
                .collect(Collectors.toList());
    }


    public int getNumberOfOrders() {                                                //zwrocenie liczby zamowien
        return this.orders.size();
    }

    public double getSumOfValues() {                                               //sumowanie wszystkich zamówien
        return orders.stream()
                .map(c -> c.getValues())
                .mapToDouble(c -> c)
                .sum();


    }


}
