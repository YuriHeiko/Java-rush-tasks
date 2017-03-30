package com.javarush.task.task19.task1908;

/* 
Выделяем числа

d:\_JavaRush\_Test\19.05.03.txt
d:\_JavaRush\_Test\temp.txt
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                for (String chunk : line.split(" ")) {
                    try {
                        fileWriter.write(Integer.parseInt(chunk) + " ");
                    } catch (NumberFormatException e) {
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }    }
}
