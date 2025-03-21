package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities() {
        System.out.println(firstName + " ma obowiązki: " + job.getResponsibilities());
    }

    public static void main(String[] args) {
        Job teacher = new Teacher(4000, "Uczenie dzieci");
        Person person1 = new Person("Jan", 35, teacher);
        person1.displayResponsibilities();

        Job programmer = new Programmer(8000, "Pisanie kodu");
        Person person2 = new Person("Anna", 28, programmer);
        person2.displayResponsibilities();
    }
}
