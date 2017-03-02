package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] quantity = new int[33];


        list.forEach(s -> s.chars().
                filter(c -> alphabet.contains((char) c)).
                forEach(c -> ++quantity[alphabet.indexOf((char) c)]));

        for (int i = 0; i < quantity.length; i++) {
            System.out.println(alphabet.get(i) + " " + quantity[i]);
        }

/*        Map<Character, Integer> map = new TreeMap<>();
        for (Character character : alphabet) {
            map.put(character, 0);
        }

        for (String s : list) {
            for (char c : s.toCharArray()) {
                if (alphabet.contains(c)) {
                    map.merge(c, 1, (v1, v2) -> v1 + v2);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%s %d%n", entry.getKey(), entry.getValue());
        }*/
    }

}
