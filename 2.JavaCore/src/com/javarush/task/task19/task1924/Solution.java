package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел

d:\_JavaRush\_Test\19.10.06.txt
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine())) {
            BufferedReader fReader = new BufferedReader(fileReader);
            StringBuilder builder = new StringBuilder();

            String line;
            while ((line = fReader.readLine()) != null) {
                for (String chunk : line.split(" ")) {
                    try {
                        int tmp = Integer.valueOf(chunk);
                        if (tmp > -1 && tmp < 13)
                            builder.append(map.get(tmp)).append(" ");
                        else
                            builder.append(chunk).append(" ");
                    } catch (NumberFormatException e) {
                        builder.append(chunk).append(" ");
                    }
                }
            }
            System.out.println(builder.substring(0, builder.length() - 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
