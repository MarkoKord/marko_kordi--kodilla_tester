package com.kodilla.inheritance.homework;

public class OperatingSystemMac extends OperatingSystem{

    public OperatingSystemMac(int yearOfProduction) {
        super(yearOfProduction);
        System.out.println("This is MacOS!");

        }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOf() {
        super.turnOf();
    }
}



