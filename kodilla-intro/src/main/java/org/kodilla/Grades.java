package org.kodilla;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        if (size > 0) {
            return grades[size - 1];
        } else { System.out.println("There is no grades added!"); return 0; }
    }

    public double getAverage() {
        if (size == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += grades[i];
        }
        return (double) sum / size;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(4);
        grades.add(6);

        // średnia ww. ocen wyniesie 5

        System.out.println("Last grade added was: " + grades.getLastGrade());
        System.out.println("Grades average: " + grades.getAverage());
    }
}
