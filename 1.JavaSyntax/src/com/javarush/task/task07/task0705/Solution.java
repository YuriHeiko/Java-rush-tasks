package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(reader.readLine());
        }

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
            arr2[i] = arr[i + arr2.length];
        }

        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
