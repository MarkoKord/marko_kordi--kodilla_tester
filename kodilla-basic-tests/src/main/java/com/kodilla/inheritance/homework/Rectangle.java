package com.kodilla.inheritance.homework;

public class Rectangle extends Shape {
    private int sideOne;
    private int sideTwo;


    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public int getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public int getCircuit() {
        return 2 * sideOne + 2 * sideTwo;
    }

    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }
}





