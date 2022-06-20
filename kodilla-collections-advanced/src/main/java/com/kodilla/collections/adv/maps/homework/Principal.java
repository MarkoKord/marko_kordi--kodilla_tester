package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String name;
    private String surname;
    private String nameOfSchool;

    public Principal(String name, String surname, String nameOfSchool) {
        this.name = name;
        this.surname = surname;
        this.nameOfSchool = nameOfSchool;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nameOfSchool='" + nameOfSchool + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(name, principal.name) && Objects.equals(surname, principal.surname) && Objects.equals(nameOfSchool, principal.nameOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, nameOfSchool);
    }
}

