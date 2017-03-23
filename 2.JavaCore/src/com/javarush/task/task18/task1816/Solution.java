package com.javarush.task.task18.task1816;

/* 
Английские буквы

d:\_JavaRush\_Test\Dear Sir or Madam.txt

*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
//        args = new String[]{"d:\\_JavaRush\\_Test\\Dear Sir or Madam.txt"};

        try (FileReader fileReader = new FileReader(args[0])) {
            int symbol = 0;
            int count = 0;
            while ((symbol = fileReader.read()) != -1) {
                if (symbolIsEnglishLetter(symbol)) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean symbolIsEnglishLetter(int symbol) {
        return (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z');
    }
}
