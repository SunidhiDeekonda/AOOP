package com.GenericInterface;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 7, 2, 8};
        String[] strArray = {"apple", "orange", "banana", "pear"};
        Character[] charArray = {'a', 'z', 'm', 'k'};
        Float[] floatArray = {3.5f, 2.4f, 5.6f, 1.2f};

        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>();
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();

        System.out.println("Integer Array: Min = " + intMinMax.min(intArray) + ", Max = " + intMinMax.max(intArray));
        System.out.println("String Array: Min = " + strMinMax.min(strArray) + ", Max = " + strMinMax.max(strArray));
        System.out.println("Character Array: Min = " + charMinMax.min(charArray) + ", Max = " + charMinMax.max(charArray));
        System.out.println("Float Array: Min = " + floatMinMax.min(floatArray) + ", Max = " + floatMinMax.max(floatArray));
    }
}

