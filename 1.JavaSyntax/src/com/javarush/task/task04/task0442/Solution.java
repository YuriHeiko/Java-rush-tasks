package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        int result = 0;

        while ((number = Integer.valueOf(reader.readLine())) != -1) {
            result += number;
        }

        System.out.println(result + number);
    }
}
