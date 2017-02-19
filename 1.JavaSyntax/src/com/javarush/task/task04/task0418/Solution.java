package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(
                (int) Math.min(
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine())
                )
        );
    }
}