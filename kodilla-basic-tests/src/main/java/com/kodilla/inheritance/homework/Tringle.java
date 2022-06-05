package com.kodilla.inheritance.homework;

public class Tringle extends Shape{
    private int high;
    private int side;


    public Tringle(int high, int side) {
        this.high = high;
        this.side = side;
    }

    @Override
    public int getArea() {
        return (this.side/2)*this.high;
    }

    @Override
    public int getCircuit() {
        return this.side*3;
    }

    public int getHigh() {
            return high;
        }

        public int getSide() {
            return side;
        }
    }

