package com.kodilla.inheritance.homework;

public class OperatingSystemWindows extends OperatingSystem{

    public OperatingSystemWindows(int yearOfProduction) {
       super( yearOfProduction);
        System.out.println("This is Windows 1.0! ");
    }

    @Override
    public void turnOf() {
        super.turnOf();
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }
}

