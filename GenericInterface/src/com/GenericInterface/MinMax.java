package com.GenericInterface;

interface MinMax<T extends Comparable<T>> {
    T min(T[] array);
    T max(T[] array);
}
