package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book pepers = new Book(title, author);

        for (Book peper : books) {

            if (peper.getTitle().equals(title)) {
                System.out.println("same title");

                return peper;
            }

            if (peper.getAuthor().equals(author)) {
                System.out.println("same author");

                return peper;
            }

        }
        books.add(pepers);
        return pepers;


    }
}

