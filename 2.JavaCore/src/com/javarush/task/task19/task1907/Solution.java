package com.javarush.task.task19.task1907;

/* 
Считаем слово


d:\_JavaRush\_Test\19.05.02.txt


*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine())) {
            int nextChar;
            StringBuilder builder = new StringBuilder();
            while ((nextChar = fileReader.read()) != -1) {
                builder.append((char)nextChar);
            }

            String[] words = builder.toString().replaceAll("[\\p{Punct}+]", " ").split(" ");
            int count = 0;
            for (String word : words) {
                if (word.equalsIgnoreCase("world")) {
                    count++;
                }
            }

            System.out.println(count);

        /*        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             Scanner scanner = new Scanner(new FileReader(reader.readLine())).useDelimiter("[\\p{Punct} ]")) {
            int count = 0;
            while (scanner.hasNext()) {
                if (scanner.next().equalsIgnoreCase("world")) {
                    count++;
                }
            }

            System.out.println(count);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

