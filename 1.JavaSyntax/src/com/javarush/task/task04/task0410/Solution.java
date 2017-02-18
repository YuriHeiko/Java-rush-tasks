package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a) {
        // не принимает
        String result = a + " не";
        if (a >= 50 && a <= 100) {
            result = "" + a;
        }
        System.out.printf("Число %s содержится в интервале.", result);
    }
}