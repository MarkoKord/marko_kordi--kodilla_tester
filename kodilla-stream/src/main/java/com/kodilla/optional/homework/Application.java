package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static List<String> getStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Arek Woda", new Teacher("Anita Nowak")));
        students.add(new Student("Anita Rzeka", null));
        students.add(new Student("Kasia Morze", null));
        students.add(new Student("Zbyszek Staw", new Teacher("Anna Kowalska")));
        students.add(new Student("Michał Jezioro", null));


        List<String> names = new ArrayList<>();  //stworzenie tabeli typu String, do której dodajemy elementy przeiterowane przez tabelę
                                                //gdyby nie było przypisania elementow do tabeli Stringów niemoglbym testowac poniewaz petla for printowalaby tylko na konsole

        for (Student student : students) {
            names.add                           //dodanie każdego elementu do tabeli name
                    ("Uczen: " + student.getStudentName() + " | " + "Nauczyciel: "
                            + Optional.ofNullable(student.getTeacher()).map(Teacher::getteacherName).orElse("<undefined>"));


        }
        return names;


    }

    public static void main(String[] args) {
        System.out.println(getStudentList());
    }
}



