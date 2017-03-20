package com.javarush.task.task18.task1807;

/* 
Подсчет запятых

d:\_JavaRush\_Test\Dear Sir or Madam.txt
4
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {

            int count = 0;
            while (fis.available() > 0) {
                if (fis.read() == ',') {
                    count++;
                }
            }

            System.out.println(count);
        } catch (IOException e) {

        }
    }
}
