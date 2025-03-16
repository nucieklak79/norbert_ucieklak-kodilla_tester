package org.kodilla;

import java.util.Scanner;

public class ColorSelector {

    public static void main(String[] args) {
        System.out.println("Wybrany kolor to: " + getColor());
    }

    // metoda odczytuje pierwszą literę koloru

    public static char getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Wprowadź pierwszą literę z nazwy ulubionego koloru: ");
            char firstLetter = scanner.next().toLowerCase().charAt(0);
            return firstLetter;
        }
    }

    //poniższa metoda ustala, o który kolor chodzi.
    public static String getColor() {
        String color;
        char firstLetter = getFirstLetter();
        switch (firstLetter) {
            case 'c': color = "czerwony";
                break;
            case 'n': color = "niebieski";
                break;
            case 'z': color = "zielony";
                break;
            case 'ż': color = "żółty";
                break;
            case 'f': color = "fioletowy";
                break;
            case 'p': color = "pomarańczowy";
                break;
            case 'r': color = "różowy";
                break;
            case 's': color = "szary";
                break;
            case 'g': color = "granatowy";
                break;
            case 'b': color = "brązowy";
                break;
            default: color = "Nieznany kolor";
        }
        return color;
    }
}
