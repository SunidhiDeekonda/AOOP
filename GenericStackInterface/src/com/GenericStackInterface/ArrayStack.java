package com.GenericStackInterface;

import java.util.Arrays;

class ArrayStack<T> implements Stack<T> {
    private T[] array;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
        top = -1;
    }

    @Override
    public void push(T item) {
        if (top == capacity - 1) {
            resize();
        }
        array[++top] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return array[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return array[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }
}

