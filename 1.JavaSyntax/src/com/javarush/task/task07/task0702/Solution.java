package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strings.length - 2; i++) {
            strings[i] = reader.readLine();
        }

        for (int i = strings.length; i > 0; i--) {
            System.out.println(strings[i-1]);
        }
    }
}