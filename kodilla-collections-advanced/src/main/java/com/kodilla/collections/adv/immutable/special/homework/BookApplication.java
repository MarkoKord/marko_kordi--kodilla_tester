package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {


        BookManager bookManager = new BookManager();

        Book book1 = BookManager.createBook("Zaginiecie", "Remigiusz Mroz");

        Book book2 = BookManager.createBook("Nadchodzi III wojna swiatowa", "Piotr Zychowicz");

        Book book3 = BookManager.createBook("Ty", "Zoran Drvenkar");

        Book book4 = BookManager.createBook("Ty", "Zoran Drvenkar");


        System.out.println(book1 == book2);
        System.out.println(book2 == book3);
        System.out.println(book1 == book3);
        System.out.println(book3 == book4);



    }
}
