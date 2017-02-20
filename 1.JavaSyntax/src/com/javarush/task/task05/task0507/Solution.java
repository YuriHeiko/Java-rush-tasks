package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        int result = 0;
        int counter = 0;

        while ((number = Integer.valueOf(reader.readLine())) != -1) {
            result += number;
            counter++;
        }

        System.out.println((double) result / counter);
    }
}

