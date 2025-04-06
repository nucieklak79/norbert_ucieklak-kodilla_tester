package com.kodilla.collections.adv.immutable.homework;

public class TaskApplication {
    public static void main(String[] args) {
        Task task = new Task("Buy food", 25);

        System.out.println("Your task is: " + task.title() + " and it's duration is: " + task.duration());
    }
}
