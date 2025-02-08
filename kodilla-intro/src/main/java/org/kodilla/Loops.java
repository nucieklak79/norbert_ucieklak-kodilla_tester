package org.kodilla;

public class Loops {
    public static void main(String[] args) {

        String[] names = {"Zygfryd", "Gwidon", "Florentyna", "Bartosz"};

        // Displaying elements straight forward
        for (int i = 0; i < names.length; i++) {
            System.out.println("Element nr " + i + " tablicy ma wartość: \"" + names[i] + "\"");
        }

        // Displaying elements in reverse
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println("Element nr " + i + " tablicy ma wartość: \"" + names[i] + "\"");
        }

        // Array sum

        int[] myTable = {1, 3, 5, 7};
        System.out.println("Suma elementów tablicy to: " + sumMyArray(myTable));
    }
    public static int sumMyArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
