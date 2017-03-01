package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();

        arrayList.add(new int[5]);
        arrayList.add(new int[2]);
        arrayList.add(new int[4]);
        arrayList.add(new int[7]);
        arrayList.add(new int[0]);

        for (int[] ar : arrayList) {
            for (int i = 0; i < ar.length; i++) {
                ar[i] = (int)(Math.random() * 1001);
            }
        }

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
