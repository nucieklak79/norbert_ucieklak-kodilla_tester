package org.kodilla;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 900, 2009);
        System.out.println("Waga laptopa to: " + notebook.weight + " a jego cena to: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkParameters();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2011);
        System.out.println("Waga laptopa to: " + heavyNotebook.weight + " a jego cena to: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkParameters();

        Notebook oldNotebook = new Notebook(1600, 1500, 2023);
        System.out.println("Waga laptopa to: " + oldNotebook.weight + " a jego cena to: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkParameters();
    }
}
