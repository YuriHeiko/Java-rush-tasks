package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальный байт

d:\_JavaRush\_Test\letter.pdf
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            int maxByte = Integer.MIN_VALUE;

            while (fis.available() > 0) {
                int tmp = fis.read();
                if (maxByte < tmp) {
                    maxByte = tmp;
                }
            }

            System.out.println(maxByte);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
