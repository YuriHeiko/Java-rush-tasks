package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

/*
        List<Integer> list = new LinkedList<>();
        while (fileReader.ready()) {
            list.add(Integer.valueOf(fileReader.readLine()));
        }
*/
        String line;
        List<Integer> list = new LinkedList<>();
        while ((line = fileReader.readLine()) != null) {
            list.add(Integer.valueOf(line));
        }

        list.stream().filter(v -> v % 2 == 0).sorted().forEach(System.out::println);

        reader.close();
        fileReader.close();
    }
}
