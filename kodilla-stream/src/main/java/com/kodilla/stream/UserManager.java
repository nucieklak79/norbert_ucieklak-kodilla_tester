package com.kodilla.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager {

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<User> oldUsersNames = filterOlderUsersThan(30);
        System.out.println(oldUsersNames);

        List<User> oldestUsersNames = findOldestUserInGroup("Chemists");
        System.out.println(oldestUsersNames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

   public static List<User> filterOlderUsersThan(int age) {
        List<User> olderUsers = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return olderUsers;

   }

   public static List<User> findOldestUserInGroup(String group) {
      List<User> oldestUsers = UserRepository.getUserList()
              .stream()
              .filter(user -> user.getGroup().equals(group))
              .max(Comparator.comparingInt(User::getAge))
              .stream().collect(Collectors.toList());


       return oldestUsers;

   }


    private static List<User> getUserList() {
        return UserRepository.getUserList();
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }


}
