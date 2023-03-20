package com.systelab.kata;

import java.util.*;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        Deque<String> directions = new ArrayDeque<>();
        for (String currentDirection : arr) {
            String lastDirection = directions.peekLast();
            if (cancelsWith(lastDirection, currentDirection)) {
                directions.removeLast();
            } else {
                directions.addLast(currentDirection);
            }
        }
        return directions.toArray(new String[0]);
    }

    private static boolean cancelsWith(String lastDirection, String currentDirection) {
        return ("SOUTH".equals(currentDirection) && "NORTH".equals(lastDirection)) ||
                ("NORTH".equals(currentDirection) && "SOUTH".equals(lastDirection)) ||
                ("EAST".equals(currentDirection) && "WEST".equals(lastDirection)) ||
                ("WEST".equals(currentDirection) && "EAST".equals(lastDirection));
    }
}