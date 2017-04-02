package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Ищем нужные строки

d:\_JavaRush\_Test\19.10.04.txt

*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine())) {
            BufferedReader fReader = new BufferedReader(fileReader);

            String line;
            while ((line = fReader.readLine()) != null) {
                String[] splitString = line.replaceAll("[\\p{Punct}+]", "").split(" ");
                List<String> list = new LinkedList<>(Arrays.asList(splitString));
                list.retainAll(words);
                if (list.size() == 2) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
