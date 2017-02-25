package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put("Surname" + i, "Name" + i);
        }

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        return Collections.frequency(map.values(), name);
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        return Collections.frequency(map.keySet(), lastName);
    }

    public static void main(String[] args) {

    }
}
