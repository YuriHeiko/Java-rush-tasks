package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put("name" + i, i + 495);
        }

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Integer> iter = map.values().iterator();

        while (iter.hasNext()) {
            if (iter.next() < 500) {
                iter.remove();
            }
        }

//        map.values().removeIf(integer -> integer < 500);

    }

    public static void main(String[] args) {

    }
}