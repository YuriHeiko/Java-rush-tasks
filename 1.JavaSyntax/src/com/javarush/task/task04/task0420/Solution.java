package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[3];
        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        arr[2] = Integer.parseInt(reader.readLine());

        Arrays.sort(arr, Collections.reverseOrder());

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}
