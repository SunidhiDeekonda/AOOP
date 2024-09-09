package com.GenericPriorityQueueInterface;

import java.util.ArrayList;
import java.util.List;

class BinaryHeapPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {
    private List<T> heap;

    public BinaryHeapPriorityQueue() {
        heap = new ArrayList<>();
    }

    @Override
    public void insert(T item) {
        heap.add(item);
        siftUp(heap.size() - 1);
    }

    @Override
    public T extractMax() {
        if (isEmpty()) {
            return null;
        }
        T max = heap.get(0);
        T lastItem = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, lastItem);
            siftDown(0);
        }
        return max;
    }

    @Override
    public T peek() {
        return isEmpty() ? null : heap.get(0);
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void siftUp(int index) {
        T item = heap.get(index);
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T parent = heap.get(parentIndex);
            if (item.compareTo(parent) <= 0) {
                break;
            }
            heap.set(index, parent);
            index = parentIndex;
        }
        heap.set(index, item);
    }

    private void siftDown(int index) {
        T item = heap.get(index);
        int half = heap.size() / 2;
        while (index < half) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            int largestChild = leftChild;
            if (rightChild < heap.size() && heap.get(rightChild).compareTo(heap.get(leftChild)) > 0) {
                largestChild = rightChild;
            }
            if (item.compareTo(heap.get(largestChild)) >= 0) {
                break;
            }
            heap.set(index, heap.get(largestChild));
            index = largestChild;
        }
        heap.set(index, item);
    }
}

