package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String salary = reader.readLine();
        String years = reader.readLine();
        System.out.format("%s получает %s через %s лет.", name, salary, years);
    }
}
