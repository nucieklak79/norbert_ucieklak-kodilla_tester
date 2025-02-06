package org.kodilla;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2025;

        if (checkLeapYear(year)) {
            System.out.println("Rok " + year + " jest rokiem przestępnym");
        } else { System.out.println("Rok " + year + " nie jest rokiem przestępnym"); }
    }

    public static boolean checkLeapYear(int dateToCheck) {

        if (dateToCheck % 4 != 0) {
            return false;
        } else if (dateToCheck % 100 != 0) {
            return true;
        } else if (dateToCheck % 400 == 0) {
            return true;
        }
        return false;
    }
}
