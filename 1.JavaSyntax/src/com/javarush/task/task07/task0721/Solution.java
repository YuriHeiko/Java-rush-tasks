package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(reader.readLine());
        }



        for (int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i]) {
                maximum = numbers[i];
            }

            if (minimum > numbers[i]) {
                minimum = numbers[i];
            }
        }

        System.out.println(maximum + " " + minimum);
/*
        System.out.println(maximum);
        System.out.println(minimum);
*/
    }
}
