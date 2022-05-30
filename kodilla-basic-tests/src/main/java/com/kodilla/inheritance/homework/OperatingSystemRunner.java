package com.kodilla.inheritance.homework;

public class OperatingSystemRunner {
    public static void main(String[] args) {
       OperatingSystem operationSystem= new OperatingSystem(1);                    //wywolanie klasy matki(głownej)


        operationSystem.turnOn();                                                                //wywołanie metody turn.on z klasy(glownej)
OperatingSystemWindows operatingSystemWindows=new OperatingSystemWindows(1985);    // odniesienie do klasy windows i przypisanie do niego roku produkcji
operatingSystemWindows.displayYearOfProduction();                                                // odniesienie do klasy windows i użyie metody z klasy glownej
        operationSystem.turnOf();


        operationSystem.turnOn();
       OperatingSystemMac operatingSystemMac=new OperatingSystemMac(2002);
       operatingSystemMac.displayYearOfProduction();
        operationSystem.turnOf();
    }
}

