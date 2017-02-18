package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());

        System.out.println("Треугольник " + (isTrianglePresent(a, b, c) ? "существует." : "не существует."));
    }

    private static boolean isTrianglePresent(int a, int b , int c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
}