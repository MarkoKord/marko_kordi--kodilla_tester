package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import javax.swing.*;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-------------");
        System.out.println("Car model: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
        car.increaseSpeed();
        System.out.println("Car speed increase: " + car.getSpeed());
    }

        private static String getCarName(Car car) {    //metoda do wyboru modelu samochodu
            if (car instanceof Audi)
                return "Audi";
             else if (car instanceof Ford)
                    return "Ford";
             else if (car instanceof Opel)
                 return "Opel";
            else
               return "Unknow car model";
        }
    }


