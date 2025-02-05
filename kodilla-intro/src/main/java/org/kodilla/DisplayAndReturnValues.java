package org.kodilla;

public class DisplayAndReturnValues {

    public static void main(String[] args) {

        // Returning full name by function returnFullName
        System.out.println("Your full name: " + returnFullName("Norbert", "Ucieklak"));

        // Displaying full name by method displayFullName
        displayFullName("Marta", "Mzyk");
    }

    // Static function returning value
    static String returnFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    // Static method displaying value
    static void displayFullName(String firstName, String lastName) {
        System.out.println("Your full name: " + firstName + " " + lastName);
    }
}
