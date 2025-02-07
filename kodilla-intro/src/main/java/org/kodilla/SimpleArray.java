package org.kodilla;

public class SimpleArray {
    public static void main(String[] args) {

        String[] names = new String[] {"Norbert", "Marta", "Aleksander", "Miłosz", "Julek"};

        String singleName = names[3];
        System.out.println("Wartość elementu tablicy o indeksie 3 to: \"" + singleName +"\"");
        System.out.println("Moja tablica zawiera " + names.length + " elementów.");

    }
}
