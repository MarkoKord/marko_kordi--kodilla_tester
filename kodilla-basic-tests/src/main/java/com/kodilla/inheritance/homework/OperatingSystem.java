package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfProduction;                                //typ danych prywatny

    public OperatingSystem(int yearOfProduction) {              //konstruktor
        this.yearOfProduction = yearOfProduction;

    }

    public void turnOn() {                                        //metoda on
        System.out.println("System were turned on");
    }

    public void turnOf() {
        System.out.println("System were turned off");
    }          //metoda off

    public void displayYearOfProduction(){
        System.out.println("Year of Production System:" + "" + yearOfProduction);  //wyświetlenie komunikatu+ roku produkcji
    }

    public int getYearOfProduction() {
        return yearOfProduction;                                                    //getter, żeby móc pobierac wartość pola year
    }

}
