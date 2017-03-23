package com.javarush.task.task18.task1821;

/* 
Встречаемость символов

d:/_JavaRush/_Test/Dear Sir or Madam.txt
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
//        args = new String[]{"d:\\_JavaRush\\_Test\\Dear Sir or Madam.txt"};

        try (FileInputStream fis = new FileInputStream(args[0])) {

            Map<Character, Integer> map = new TreeMap<>();

            while (fis.available() > 0) {
                map.merge((char)fis.read(), 1, (k, v) -> k + v);
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.printf("%s %d%n", entry.getKey(), entry.getValue());
            }
/*
            int symbol;
            int[] frequency = new int[256];
            while ((symbol = fis.read()) != -1) {
                frequency[symbol]++;
            }

            for (int i = 0; i < 256; i++) {
                if (frequency[i] != 0) {
                    System.out.printf("%s %d%n", (char)i, frequency[i]);
                }
            }
*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
