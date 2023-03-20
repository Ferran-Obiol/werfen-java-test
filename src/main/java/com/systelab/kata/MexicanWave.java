package com.systelab.kata;


import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        // Your code here
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                result.add(toUppercaseCharAtPosition(str, i));
            }
        }
        return result.toArray(String[]::new);
    }

    private static String toUppercaseCharAtPosition(String str, int i) {
        StringBuilder temporaryString = new StringBuilder(str.length()).append(str);
        temporaryString.setCharAt(i, Character.toUpperCase(str.charAt(i)));
        return temporaryString.toString();
    }
}