package com.FilterDoubleAndCollectEvenNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EvenNumberProcessor {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Stream pipeline to filter even numbers, double them, and collect into a list
        List<Integer> processedNumbers = numbers.stream()
                                                .filter(n -> n % 2 == 0)
                                                .map(n -> n * 2)
                                                .collect(Collectors.toList());

        // Displaying the processed list
        System.out.println("Processed list: " + processedNumbers);
    }
}

