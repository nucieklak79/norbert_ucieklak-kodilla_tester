package org.kodilla;

public class Application {
    private String name;
    private double age;
    private double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkUserConditions() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main(String[] args) {
        Application user = new Application("Adam", 40.5, 178);
        user.checkUserConditions();
    }
}