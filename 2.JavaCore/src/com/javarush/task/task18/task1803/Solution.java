package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Самые частые байты

d:\_JavaRush\_Test\task18.task1803.txt
102 100 97
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            int[] count = new int[256];
            int maxByte = Integer.MIN_VALUE;

            while (fis.available() > 0) {
                int tmp = fis.read();
                if (maxByte < ++count[tmp]) {
                    maxByte = count[tmp];
                }
            }

            for (int i = count.length - 1; i >= 0; i--) {
                if (count[i] == maxByte) {
                    System.out.print(i + " ");
                }
            }
/*            Map<Integer, Integer> map = new HashMap<>();
            int max = 0;
            while (fis.available() > 0) {
                int newValue = map.merge(fis.read(), 1, (o, n) -> o + n);
                if (newValue > max) {
                    max = newValue;
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max) {
                    System.out.print(entry.getKey() + " ");
                }
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
