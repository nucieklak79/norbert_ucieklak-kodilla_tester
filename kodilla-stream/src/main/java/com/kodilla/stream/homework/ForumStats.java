package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;
import com.kodilla.stream.User;

import java.util.List;
import java.util.OptionalDouble;

public class ForumStats {

    public static double averagePostsForUsersAboveOrEqual40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);

    }

    public static double averagePostsForUsersBelow40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UserRepository.getUserList();

        double avgAboveOrEqual40 = averagePostsForUsersAboveOrEqual40(users);
        double avgBelow40 = averagePostsForUsersBelow40(users);

        System.out.println("Average number of posts published (user age >= 40): " + avgAboveOrEqual40);
        System.out.println("Average number of posts published (user age < 40): " + avgBelow40);
    }
}
