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
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(args[0])) {
            BufferedReader fReader = new BufferedReader(fileReader);

            Map<String, Double> map = getCollectByGroup(fReader.lines());

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Double> getCollectByGroup(Stream<String> lines) {
        return lines
                .map(s -> s.split(" "))
                .collect(Collectors.groupingBy(s -> s[0],
                        TreeMap::new,
                        Collectors.summingDouble(s -> Double.valueOf(s[1]))));
    }

/*    public static Map<String, Double> getCollectByToMap(Stream<String> lines) {
        return lines
                .map(s -> s.split(" "))
                .collect(Collectors.toMap(s -> s[0],
                        s -> Double.valueOf(s[1])),
                        (v1, v2) -> v1 + v2);
    }*/
}
