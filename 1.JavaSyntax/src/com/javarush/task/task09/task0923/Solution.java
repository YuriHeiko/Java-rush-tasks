package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringBuilder builderVowels = new StringBuilder();
        StringBuilder builderOther = new StringBuilder();
        for (char letter : line.toCharArray()) {
            if (isVowel(letter)) {
                builderVowels.append(letter + " ");
            } else if (letter != ' '){
                builderOther.append(letter + " ");
            }
        }

        System.out.println(builderVowels.toString());
        System.out.println(builderOther.toString());
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}