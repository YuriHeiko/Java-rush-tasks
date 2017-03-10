package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* 
Парсер реквестов

    http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo&obj=20&obj=Test=ff&obj=1.232&obj=1,1212
    lvl view name obj obj obj obj
    double 20.0
    String Test
    double 1.232
    String 1,1212
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            List<String> values = new LinkedList<>();
            for (String line : reader.readLine().split("\\?")[1].split("&")) {
                String[] splitParams = line.split("=");
                if (splitParams[0].equals("obj")) {
                    values.add(splitParams[1]);
                }
                System.out.print(splitParams[0] + " ");
            }
            System.out.println();

            for (String value : values) {
                try {
                    alert(Double.parseDouble(value));
                } catch (NumberFormatException e) {
                    alert(value);
                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
