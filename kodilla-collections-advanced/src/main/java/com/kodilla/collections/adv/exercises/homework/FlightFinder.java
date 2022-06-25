package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {

        List<Flight> from = new ArrayList<>();

        for(Flight search : FlightRepository.getFlightTable())
            if (search.getDeparture().equals(departure)) {
                from.add(search);
            }
        return from;

}


public List<Flight> findFlightsTo(String arrival) {

        List<Flight> to = new ArrayList<>();

        for (Flight search : FlightRepository.getFlightTable())
            if (search.getArrival().equals(arrival)) {
                to.add(search);
            }
        return to;



    }
}
