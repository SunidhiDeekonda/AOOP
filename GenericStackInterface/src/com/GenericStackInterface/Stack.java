package com.GenericStackInterface;

interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}

