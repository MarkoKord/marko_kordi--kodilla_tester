package com.kodilla.inheritance.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Square square = new Square(5);
        Tringle tringle = new Tringle(3, 5);
        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println("Kwadrat o boku" + " " + square.getSide() +" "+ "ma pole"+" " + square.getArea() + " "+ "i obwód"+ " " +square.getCircuit()+".");
        System.out.println("Trójkąt o wysokosci"+" " +tringle.getHigh() +" "+ "i bokach"+ " "+ tringle.getSide()+" " + "ma pole" + " " + tringle.getArea() +" "+ "i obwód" + " " +tringle.getCircuit()+".");
        System.out.println("Prostokat o bokach" + " "+ rectangle.getSideOne()+ " " + "i" + " " +rectangle.getSideTwo()+ " "+ "mają pole"+ " "+ rectangle.getArea()+ " " +"i obwód" + " "+ rectangle.getCircuit()+".");
    }
}
