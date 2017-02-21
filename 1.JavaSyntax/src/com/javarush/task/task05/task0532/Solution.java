package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        Integer quantity = Integer.valueOf(reader.readLine());
        for (int i = 0; i < quantity; i++) {
            Integer number = Integer.valueOf(reader.readLine());
            if (maximum < number) {
                maximum = number;
            }
        }

        System.out.println(maximum);
    }
}
