package com.systelab.kata;

import java.util.Arrays;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        // Your code here.
        return Arrays.stream(numbers).filter(value -> value % divider == 0).toArray();
    }
}
