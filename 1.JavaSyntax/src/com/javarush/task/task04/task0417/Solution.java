package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());

        String result = "";

        if (a == b) {
            result += a + " " + b + (a == c ? " " + c : "");
        } else if (b == c) {
            result += b + " " + c + (a == c ? " " + a : "");
        } else if (c == a) {
            result += c + " " + a + (b == c ? " " + b : "");
        }

        if (!result.isEmpty()) {
            System.out.println(result);
        }
    }
}