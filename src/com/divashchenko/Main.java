package com.divashchenko;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(0, "Alex"));
        users.add(new User(1, "Mike"));
        users.add(new User(2, "Olga"));
        users.add(new User(0, "Bill"));

        System.out.println(users);
        System.out.println(deleteUsersDuplicates(users));
    }

    private static List<User> deleteUsersDuplicates(List<User> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
