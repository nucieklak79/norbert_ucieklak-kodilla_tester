package org.kodilla;

import java.util.Random;

public class RandomNumbers {
    private int[] numbers;
    private int count;

    public RandomNumbers() {
        this.numbers = new int[1000];
        this.count = 0;
    }

    public void generateNumbers() {
        Random random = new Random();
        int sum = 0;

        while (sum <= 5000) {
            int randomNumber = random.nextInt(31);
            numbers[count] = randomNumber;

            sum += randomNumber;
            count++;

        }
    }

    public int getMin() {
        if (count == 0) {
            return 0; // Brak wylosowanych liczb
        }

        int min = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int getMax() {
        if (count == 0) {
            return 0; // Brak wylosowanych liczb
        }

        int max = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateNumbers();

        System.out.println("The lowest number: " + randomNumbers.getMin());
        System.out.println("The highest number: " + randomNumbers.getMax());
    }
}