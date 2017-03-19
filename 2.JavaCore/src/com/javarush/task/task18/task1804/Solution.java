package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
d:\_JavaRush\_Test\task18.task1803.txt
121 116 114 111 107 101 91 59 44
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
/*            int[] count = new int[256];
            int min = Integer.MAX_VALUE;

            while (fis.available() > 0) {
                int tmp = fis.read();
                if (min > ++count[tmp]) {
                    min = count[tmp];
                }
            }

            for (int i = count.length - 1; i >= 0; i--) {
                if (count[i] == min) {
                    System.out.print(i + " ");
                }
            }*/
            Map<Integer, Integer> map = new HashMap<>();
            int min = Integer.MAX_VALUE;
            while (fis.available() > 0) {
                int newValue = map.merge(fis.read(), 1, (o, n) -> o + n);
                if (newValue < min) {
                    min = newValue;
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == min) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}