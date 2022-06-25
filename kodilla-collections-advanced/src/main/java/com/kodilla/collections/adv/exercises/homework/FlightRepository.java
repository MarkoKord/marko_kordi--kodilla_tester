package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable() {
List<Flight> flight = new ArrayList<>();
flight.add(new Flight("Poland", "United Kingdom"));
flight.add(new Flight("Germany", "Italy"));
flight.add(new Flight("Italy", "Serbia"));
flight.add(new Flight("Spain", "Hungary"));
flight.add(new Flight("Poland", "Hungary"));
flight.add(new Flight("Spain", "Mexico"));
flight.add(new Flight("New Zealand", "Hungary"));


        System.out.println(flight);

return flight;
    }

}
