package com.javarush.task.task19.task1920;

/* 
Самый богатый

d:\_JavaRush\_Test\19.10.01.txt
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(args[0])) {
            BufferedReader fReader = new BufferedReader(fileReader);
            Map<String, Double> map = new TreeMap<>();
            Double maxValue = Double.MIN_VALUE;

            String line;
            while ((line = fReader.readLine()) != null) {
                String[] chunks = line.split(" ");
                Double result = map.merge(chunks[0], Double.valueOf(chunks[1]), (v1, v2) -> v1 + v2);
                if (maxValue.compareTo(result) < 0) {
                    maxValue = result;
                }
            }

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getValue().compareTo(maxValue) == 0) {
                    System.out.println(entry.getKey());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
