package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт

d:\_JavaRush\_Test\task18.task1803.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {

            Set<Integer> set = new TreeSet<>();
            while (fis.available() > 0) {
                set.add(fis.read());
            }

            set.forEach(e -> System.out.print(e + " "));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
