package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int minLength = Integer.MAX_VALUE;
        for (String string : strings) {
            if (string.length() < minLength) {
                minLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == minLength) {
                System.out.println(string);
            }
        }
    }
}
