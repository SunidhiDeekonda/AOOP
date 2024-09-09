package com.SortStringsInDecendingOrder;

import java.util.ArrayList;
import java.util.List;

class StringSorter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("kiwi");

        // Sorting the list in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Displaying the sorted list
        System.out.println("Sorted list in descending order: " + strings);
    }
}

