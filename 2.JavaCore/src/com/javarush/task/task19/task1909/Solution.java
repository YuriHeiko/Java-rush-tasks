package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                fileWriter.write(line.replaceAll("\\.", "!"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
