package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        arr[0] = Integer.valueOf(reader.readLine());
        arr[1] = Integer.valueOf(reader.readLine());
        arr[2] = Integer.valueOf(reader.readLine());

        int counterPositive = 0;
        int counterNegative = 0;

        for (int a : arr) {
            if (a > 0) {
                counterPositive++;
            } else if (a < 0) {
                counterNegative++;
            }
        }

        System.out.println("количество отрицательных чисел: " + counterNegative);
        System.out.println("количество положительных чисел: " + counterPositive);
    }
}
