package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void TestFindFlightsFrom() {

        FlightFinder fly = new FlightFinder();                             //utworzenie obiektu z klasy FlightFinder, o obiekciefly
        List<Flight> result = fly.findFlightsFrom("Poland");      // utworzenie listy i przypisanie zmiennej result, wywołanie metody do zmiennej fly
        assertEquals(2, result.size());                            // użycie metody z oczekiwanym wynikiem
    }
@Test
    public void TestFindFlightsTo() {
        FlightFinder fly = new FlightFinder();
        List<Flight> result = fly.findFlightsTo("Hungary");
    assertEquals(3, result.size());
    }


}


