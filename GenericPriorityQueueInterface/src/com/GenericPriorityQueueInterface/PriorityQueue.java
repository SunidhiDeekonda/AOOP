package com.GenericPriorityQueueInterface;

interface PriorityQueue<T extends Comparable<T>> {
    void insert(T item);
    T extractMax();
    T peek();
    boolean isEmpty();
}

