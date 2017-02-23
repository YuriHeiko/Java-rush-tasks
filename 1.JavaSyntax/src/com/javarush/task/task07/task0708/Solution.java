package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int maxLength = 0;
        for (String string : strings) {
            if (string.length() > maxLength) {
                maxLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == maxLength) {
                System.out.println(string);
            }
        }
    }
}
