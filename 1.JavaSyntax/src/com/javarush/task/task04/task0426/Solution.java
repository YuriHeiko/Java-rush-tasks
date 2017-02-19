package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        String result = (a % 2 == 0 ? "четное" : "нечетное") + " число";

        if (a > 0) {
            result = "положительное " + result;
        } else if (a < 0) {
            result = "отрицательное " + result;
        } else {
            result = "ноль";
        }

        System.out.println(result);
    }
}
