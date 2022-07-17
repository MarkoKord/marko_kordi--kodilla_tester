package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double values;
    private LocalDate data;
    private String name;

    public Order(double values, LocalDate data, String name) {
        this.values = values;
        this.data = data;
        this.name = name;
    }


    public double getValues() {
        return values;
    }


    public LocalDate getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "values=" + values +
                ", data=" + data +
                ", name='" + name + '\'' +
                '}';
    }
}
