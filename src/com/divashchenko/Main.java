package com.divashchenko;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    private static List<User> deleteUsersDuplicates(List<User> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
