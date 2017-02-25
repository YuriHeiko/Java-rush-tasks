package com.javarush.task.task08.task0813;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("Л" + i);
        }

        return (HashSet<String>) set;
    }

    public static void main(String[] args) {

    }
}
