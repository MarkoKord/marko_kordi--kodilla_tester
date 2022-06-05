package com.kodilla.inheritance.homework;

public class Person {


    private String name;
    private int age;

    private Job job;                                                    //odwołanie do klasy Job w której mamy metodę

    public Person(String name, int age, Job job) {

        this.name = name;
        this.age = age;
        this.job = job;
    }


    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public Job getJob() {                     //public Job bez operatora typu String, bo jest to odwołanie do klasy Job
        return job;
    }
    public void printResponsibilities() {
        System.out.println(this.job.getResponsibilities());
    }

    }




