package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.asserEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Meoda sum nie działa poprawnie dla licz" + a + " i " + b);
        }
        Calculator subcalc = new Calculator();
        int x = 10;
        int y = 5;
        int subResult = calculator.sub(x, y);
        boolean cottect = ResultChecker.asserEquals(5, subResult);
        if (cottect) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + x + " i " + y);
        } else {
            System.out.println("Metoda sub działa nie poprawnie dla liczb" + x + "i" + y);
        }
        Calculator square = new Calculator();
        int c = 10;
        int sqareResult = calculator.square(c);
        boolean correctt = ResultChecker.asserEquals(10, sqareResult);
        if (correctt) {
            System.out.println("Metoda square działa poprawnie dla liczby" + " " +c);
        } else {
            System.out.println("Metoda square działa nie poprawnie dla liczby " + " " +c);
        }
    }
}