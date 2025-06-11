package com.kodilla.jacoco;

public class Year {
    int yearToCheck;

    public Year(int year) {
        this.yearToCheck = year;
    }
    public boolean isLeap() {
        return (yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0);
    }
}

