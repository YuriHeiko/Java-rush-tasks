package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        if (Integer.valueOf(reader.readLine()) < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
