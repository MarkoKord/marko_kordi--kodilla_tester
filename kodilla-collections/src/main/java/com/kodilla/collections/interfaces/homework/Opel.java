package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{



    private int speed;

    public Opel(int speed){
        this.speed=speed;
    }


    @Override
    public void increaseSpeed() {
        speed = speed +50;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 34;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
