package com.kodilla.inheritance.homework;

public class Square extends Shape {
    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }

    @Override
    public int getCircuit() {
        return 4 * this.side;
    }

    public int getSide(){
        return side;
    }
}