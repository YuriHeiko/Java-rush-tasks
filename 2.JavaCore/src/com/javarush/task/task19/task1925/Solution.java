package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(args[0]);
             FileWriter fileWriter = new FileWriter(args[1])) {

            BufferedReader fReader = new BufferedReader(fileReader);
            String result = fReader.lines()
                    .flatMap(s -> Arrays.asList(s.split(" ")).stream())
                    .filter(w -> w.length() > 6)
                    .reduce((w1, w2) -> w1 + "," + w2).orElse("");

            fileWriter.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
