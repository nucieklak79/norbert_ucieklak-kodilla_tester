package com.kodilla.collections.adv.maps.homework;

public class Principal {

    private String firstname, surname;

    public Principal(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
