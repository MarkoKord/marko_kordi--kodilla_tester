package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(120);
        System.out.println("Audi speed:"); doRace(audi);

        Opel opel = new Opel(110);
        System.out.println("Opel speed:"); doRace(opel);

        Ford ford = new Ford(130);
        System.out.println("Ford speed:"); doRace(ford);
    }

    public static void doRace(Car car) {
car.increaseSpeed();
car.increaseSpeed();
car.increaseSpeed();
car.decreaseSpeed();
car.decreaseSpeed();
        System.out.println(car.getSpeed());

    }

}
