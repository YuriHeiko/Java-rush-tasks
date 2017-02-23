package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }

        for (Integer number : list) {
            if (number % 2 != 0 && number % 3 != 0) {
                list3.add(number);
            } else {
                if (number % 3 == 0) {
                    list1.add(number);
                }

                if (number % 2 == 0) {
                    list2.add(number);
                }
            }
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
