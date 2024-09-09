package com.GenericStackInterface;

public class Main {
    public static void main(String[] args) {
        // Test LinkedListStack with Integer
        Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("LinkedListStack (Integer):");
        System.out.println("Peek: " + linkedListStack.peek());
        System.out.println("Pop: " + linkedListStack.pop());
        System.out.println("Is Empty: " + linkedListStack.isEmpty());

        // Test ArrayStack with String
        Stack<String> arrayStack = new ArrayStack<>(2);
        arrayStack.push("Hello");
        arrayStack.push("World");
        arrayStack.push("!");
        System.out.println("\nArrayStack (String):");
        System.out.println("Peek: " + arrayStack.peek());
        System.out.println("Pop: " + arrayStack.pop());
        System.out.println("Is Empty: " + arrayStack.isEmpty());
    }
}

