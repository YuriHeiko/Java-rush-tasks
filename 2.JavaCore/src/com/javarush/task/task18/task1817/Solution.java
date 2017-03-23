package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
//        args = new String[]{"d:\\_JavaRush\\_Test\\Dear Sir or Madam.txt"};

        try (FileReader fileReader = new FileReader(args[0])) {
            int symbol;
            int countSpaces = 0;
            int countSymbols = 0;
            while ((symbol = fileReader.read()) != -1) {
                countSymbols++;
                if (symbol == ' ') {
                    countSpaces++;
                }
            }

            System.out.printf("%.2f%n", (double) countSpaces / countSymbols * 100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
