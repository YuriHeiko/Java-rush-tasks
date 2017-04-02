package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты

d:\_JavaRush\_Test\19.10.01.txt
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        BufferedReader fReader;
        try (FileReader fileReader = new FileReader(args[0])){
            fReader = new BufferedReader(fileReader);
            Map<String, Double> map = fReader.lines()
                    .map(s -> s.split(" "))
                    .collect(Collectors.groupingBy(s -> s[0], TreeMap::new, Collectors.summingDouble(s -> Double.valueOf(s[1]))));

/*                    collect(Collectors.toMap(s -> s[0],
                            s -> Double.valueOf(s[1])));*/

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
