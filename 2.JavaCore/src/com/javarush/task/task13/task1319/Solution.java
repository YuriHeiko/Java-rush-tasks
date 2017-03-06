package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        String line;
        List<String> list = new LinkedList<>();
        while (!(line = reader.readLine()).equals("exit")) {
            list.add(line);
        }
        list.add(line);

        for (String s : list) {
            writer.write(String.format("%s%n",s));
        }

        reader.close();
        writer.close();
    }
}
