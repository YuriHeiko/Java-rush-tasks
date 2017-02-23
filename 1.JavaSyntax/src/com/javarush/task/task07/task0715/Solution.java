package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[]{"мама", "мыла", "раму"}));
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "мама", "мыла", "раму");

        for (int i = 0; i < list.size(); i += 2) {
            list.add(i+1, "именно");
        }

        for (String word : list) {
            System.out.println(word);
        }
    }
}
