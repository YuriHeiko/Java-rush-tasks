package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }

        int max = 1;
        int prev = list.get(0);
        int sequence = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == prev) {
                if (++sequence > max) {
                    max = sequence;
                }
            } else {
                sequence = 1;
                prev = list.get(i);
            }
        }

        System.out.println(max);
    }
}