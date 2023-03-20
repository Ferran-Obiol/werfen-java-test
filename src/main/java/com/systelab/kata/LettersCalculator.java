package com.systelab.kata;

public class LettersCalculator {
    public static String addLetters(String... letters) {
        int currentAsciiValue = 'z';
        for (String letter : letters) {
            currentAsciiValue += letter.charAt(0) - 'a' + 1;
            if (currentAsciiValue >= 'z') {
                currentAsciiValue = 'a' - 1 + currentAsciiValue % 'z';
            }
        }
        return String.valueOf((char) currentAsciiValue);
    }
}
