package org.kodilla;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Jan", 25);
        users[1] = new User("Anna", 30);
        users[2] = new User("Piotr", 22);
        users[3] = new User("Katarzyna", 28);
        users[4] = new User("Marek", 20);

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].getAge();
        }
        double averageAge = (double) sum / users.length;

        System.out.println("Users with their age under average (" + averageAge + "):");
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < averageAge) {
                System.out.println(users[i].getName());
            }
        }
    }
}