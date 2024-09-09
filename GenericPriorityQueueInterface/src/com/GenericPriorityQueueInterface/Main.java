package com.GenericPriorityQueueInterface;

public class Main {
    public static void main(String[] args) {
        // Test with Integer
        PriorityQueue<Integer> intPQ = new BinaryHeapPriorityQueue<>();
        intPQ.insert(10);
        intPQ.insert(20);
        intPQ.insert(5);
        System.out.println("Integer Priority Queue:");
        System.out.println("Max: " + intPQ.extractMax());
        System.out.println("Max: " + intPQ.extractMax());
        System.out.println("Max: " + intPQ.extractMax());

        // Test with Double
        PriorityQueue<Double> doublePQ = new BinaryHeapPriorityQueue<>();
        doublePQ.insert(10.5);
        doublePQ.insert(20.2);
        doublePQ.insert(5.1);
        System.out.println("\nDouble Priority Queue:");
        System.out.println("Max: " + doublePQ.extractMax());
        System.out.println("Max: " + doublePQ.extractMax());
        System.out.println("Max: " + doublePQ.extractMax());

        // Test with String
        PriorityQueue<String> stringPQ = new BinaryHeapPriorityQueue<>();
        stringPQ.insert("apple");
        stringPQ.insert("orange");
        stringPQ.insert("banana");
        System.out.println("\nString Priority Queue:");
        System.out.println("Max: " + stringPQ.extractMax());
        System.out.println("Max: " + stringPQ.extractMax());
        System.out.println("Max: " + stringPQ.extractMax());
    }
}

