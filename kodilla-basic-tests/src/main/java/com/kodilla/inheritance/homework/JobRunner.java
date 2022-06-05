package com.kodilla.inheritance.homework;

public class JobRunner {
    public static void main(String[] args) {
        Person anna=new Person("Anna", 33, new Cashier(1600, "Pick orders and payments"));
        Person robert=new Person("Robert", 23, new Deliver(1100, "Deliver orders"));
        Person zuzia=new Person("Zuzia", 31, new Cook(1900, "Preparing meals "));

        System.out.println(anna.getName() + " " + "in job have to:" + " " ); anna.printResponsibilities();
        System.out.println(robert.getName() + " " + "in job have to:" + " "); robert.printResponsibilities();
        System.out.println(zuzia.getName() + " " + "in job have to:" + " "); zuzia.printResponsibilities();



    }
}

