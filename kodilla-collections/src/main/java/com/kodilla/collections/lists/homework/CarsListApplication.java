package com.kodilla.collections.lists.homework;


import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;


import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel(144);
        cars.add(opel);                              //dodanie do tabeli (opel), aby móc usunac go później metodą remove obiect
        cars.add(new Audi(142));
        cars.add(new Ford(155));
        cars.add(new Audi(88));


        cars.remove(opel);
        cars.remove(2);



        for(Car car : cars)
            CarUtils.describeCar(car);                     //wywolanie metody z CarUtils o nazwie describeCar dla elemntu z car


        System.out.println("----------------");
        System.out.println(cars);
        System.out.println("Array size is: " + cars.size());


}
}
