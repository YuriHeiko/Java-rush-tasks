package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        if (a <= 0) {
            throw new NumberFormatException();
        }

        int b = Integer.parseInt(bufferedReader.readLine());
        if (b <= 0) {
            throw new NumberFormatException();
        }

        System.out.println(NOD(a, b));
    }

    private static int NOD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return NOD(b, a % b);
    }
}