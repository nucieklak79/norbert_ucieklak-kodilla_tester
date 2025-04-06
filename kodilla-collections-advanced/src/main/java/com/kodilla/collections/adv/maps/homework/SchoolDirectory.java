package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        // Tworzenie mapy przyporządkowującej szkoły do dyrektorów
        Map<Principal, School> schoolMap = new HashMap<>();

        // Tworzenie dyrektorów
        Principal principal1 = new Principal("Jan", "Kowalski");
        Principal principal2 = new Principal("Maria", "Nowak");
        Principal principal3 = new Principal("Adam", "Smith");

        // Tworzenie szkół
        School school1 = new School("Szkoła Podstawowa nr 1");
        school1.addClassSize(25);
        school1.addClassSize(30);
        school1.addClassSize(28);

        School school2 = new School("Liceum Ogólnokształcące nr 5");
        school2.addClassSize(20);
        school2.addClassSize(22);
        school2.addClassSize(25);
        school2.addClassSize(18);

        School school3 = new School("Technikum Zawodowe nr 10");
        school3.addClassSize(15);
        school3.addClassSize(16);
        school3.addClassSize(14);
        school3.addClassSize(17);
        school3.addClassSize(19);

        // Dodawanie wpisów do mapy
        schoolMap.put(principal1, school1);
        schoolMap.put(principal2, school2);
        schoolMap.put(principal3, school3);

        // Wyświetlanie informacji o dyrektorach i szkołach
        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();
            System.out.println("Dyrektor: " + principal);
            System.out.println("Szkoła: " + school.getSchoolName());
            System.out.println("Łączna liczba uczniów: " + school.getTotalStudents());
            System.out.println("--------------------");
        }
    }

}
