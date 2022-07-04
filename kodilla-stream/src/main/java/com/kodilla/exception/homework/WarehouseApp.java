package com.kodilla.exception.homework;

import com.kodilla.optional.homework.Student;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));


        try {
            System.out.println("Your order number is : " + warehouse.getOrder("5").getNumber());
        } catch (OrderDoesentExistException e) {

            System.out.println("Sorry this orders doesn't exist");
        } finally {
            System.out.println("Thank you for using our shop");


        }
    }
}





