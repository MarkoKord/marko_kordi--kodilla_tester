package com.kodilla.inheritance.homework;

public abstract class Job {
    private double salary;
    private String responsibilities;



    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }



    public double getSalary() {
        return salary;
    }
    public String getResponsibilities() {
        return responsibilities;
    }
}