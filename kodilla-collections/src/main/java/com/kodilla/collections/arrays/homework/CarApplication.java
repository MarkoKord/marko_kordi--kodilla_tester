package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();

        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        Random random = new Random();

        int drawCarModel = random.nextInt(3);

        int a = random.nextInt(140);


        if (drawCarModel == 0)
            return new Audi(a);
        else if (drawCarModel == 1)
            return new Ford(a);
        else
            return new Opel(a);


    }
}
