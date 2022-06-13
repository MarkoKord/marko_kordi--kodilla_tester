package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;

        public Ford(int speed) {
            this.speed = speed;
        }


            public void increaseSpeed () {
                speed = speed + 30;
            }
            public void decreaseSpeed () {
                speed = speed - 25;
            }

    @Override
    public int getSpeed() {
        return speed;
    }
}




