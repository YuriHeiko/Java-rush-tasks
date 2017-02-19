package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int a = Integer.valueOf(number);
        if (a > 0 && a < 1000) {
            String result = (a % 2 == 0 ? "четное" : "нечетное");

            if (number.length() == 1) {
                result += " однозначное число";
            } else if (number.length() == 2) {
                result += " двузначное число";
            } else {
                result += " трехзначное число";
            }

            System.out.println(result);
        }
    }
}
