package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i + 1;
            System.out.println(result);
        }
    }
}
