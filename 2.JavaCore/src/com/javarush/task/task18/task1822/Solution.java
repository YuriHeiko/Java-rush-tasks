package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла

d:\_JavaRush\_Test\task18.task1822.txt
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
//        args = new String[]{"19847984"};

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fReader = new BufferedReader(new FileReader(reader.readLine()))) {
//             BufferedReader fReader = new BufferedReader(new FileReader("d:\\_JavaRush\\_Test\\task18.task1822.txt"))) {

            String line;
            while ((line = fReader.readLine()) != null) {
                if (line.startsWith(args[0] + "")) {
                    System.out.println(line);
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
