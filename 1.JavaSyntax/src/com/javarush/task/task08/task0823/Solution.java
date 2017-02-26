package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char[] chars = word.toCharArray();
                chars[0] = Character.toUpperCase(chars[0]);
                builder.append(chars).append(" ");
            }
        }

        System.out.println(builder.deleteCharAt(builder.length() - 1).toString());
    }
}
