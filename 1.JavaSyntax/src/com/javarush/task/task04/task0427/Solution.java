package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        if (a > 0 && a < 1000) {
            String result = (a % 2 == 0 ? "четное" : "нечетное");

            if (a < 10) {
                result += " однозначное число";
            } else if (a < 100) {
                result += " двузначное число";
            } else {
                result += " трехзначное число";
            }

            System.out.println(result);
        }
    }
}
