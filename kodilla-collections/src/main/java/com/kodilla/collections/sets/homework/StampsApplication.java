package com.kodilla.collections.sets.homework;

import java.util.HashSet;

public class StampsApplication {
    public static void main(String[] args) {
        HashSet<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Statue of Liberte", 20, "no" ));
        stamps.add(new Stamp("Big Ben", 22, "yes"));
        stamps.add(new Stamp("Old Trafford", 21, "no"));
        stamps.add(new Stamp("Old Trafford", 21, "no"));
        stamps.add(new Stamp("Christ the Redeemer", 19, "yes"));
        stamps.add(new Stamp("Big Ben", 22, "yes"));

        System.out.println("Stamps size is: " + stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
