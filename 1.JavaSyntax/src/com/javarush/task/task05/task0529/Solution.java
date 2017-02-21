package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int result = 0;
        while (!(line = reader.readLine()).equals("сумма")) {
            result += Integer.valueOf(line);
        }

        System.out.println(result);
    }
}
