package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;
        for (String string : strings) {
            if (string.length() > maxLength) {
                maxLength = string.length();
            }

            if (string.length() < minLength) {
                minLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == minLength || string.length() == maxLength) {
                System.out.println(string);
                break;
            }
        }
    }
}
