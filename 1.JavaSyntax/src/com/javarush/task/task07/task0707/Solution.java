package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(String.valueOf(i));
        }

        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
