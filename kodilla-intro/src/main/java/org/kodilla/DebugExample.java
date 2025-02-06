package org.kodilla;

public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            substractAndDisplay(firstNumber, secondNumber);
        } else {
            sumAndDisplay(firstNumber, secondNumber);
        }
    }
    // adding two arguments
    private static void sumAndDisplay(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    // substracting two arguments
    private  static void substractAndDisplay(int a, int b) {
        int resoult = a - b;
        System.out.println(resoult);
    }
}