package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {


        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }


    @Test
    public void testSub() {
        Calculator calculator1 = new Calculator();
        int x = 10;
        int y = 5;
        int subResult = calculator1.sub(x, y);
        assertEquals(5, subResult);
    }

    @Test
    public void testSquareMinus() {
        Calculator calculator2 = new Calculator();
        int c = -15;
        double squareResult = calculator2.square(c);
        assertEquals(225, squareResult, 0.5);
    }
    @Test
    public void testSquareZero() {
        Calculator calculator2 = new Calculator();
        int c=0;
        double squareResult=calculator2.square(c);
        assertEquals(0, squareResult, 0.05);
    }
    @Test
    public void testSquare() {
        Calculator calculator=new Calculator();
        int a =3;
        double squareResult= calculator.square(a);
        assertEquals(9, squareResult, 0.05);
    }





}

