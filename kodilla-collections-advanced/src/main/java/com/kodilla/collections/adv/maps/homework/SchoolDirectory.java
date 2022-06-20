package com.kodilla.collections.adv.maps.homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> education = new HashMap<>();
        Principal jery = new Principal("Jerry", "Jonson", "Hight School");
        Principal thomas = new Principal("Thomas", "Hawk", "Middle School");
        Principal kate = new Principal("Kate", "Foster", "State School");
        Principal michael = new Principal("Michael", "Scott", "Collage");

        School jeryEducation = new School(Arrays.asList(15, 22, 19, 25));
        School thomasEducation = new School(Arrays.asList(22, 21, 29, 30));
        School kateEducation = new School(Arrays.asList(9, 23, 29, 10));
        School michaelEducation = new School(Arrays.asList(12, 11, 23, 33));

        education.put(jery, jeryEducation);
        education.put(thomas, thomasEducation);
        education.put(kate, kateEducation);
        education.put(michael, michaelEducation);


        for (Map.Entry<Principal, School> directoryEntry : education.entrySet()) {
            System.out.println( "Principal Name : " + directoryEntry.getKey().getName() +"  " + directoryEntry.getKey().getSurname() + " |" + "Type of School: " + directoryEntry.getKey().getNameOfSchool() + " | " +  "Total students: " + directoryEntry.getValue().getSumOfStudents());

        }


    }
    }

