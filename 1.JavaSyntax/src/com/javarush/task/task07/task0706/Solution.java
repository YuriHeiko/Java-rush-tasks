package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(reader.readLine());
        }

        int evenStreetPopulation = 0;
        int oddStreetPopulation = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            evenStreetPopulation += arr[i];
            oddStreetPopulation += arr[i + 1];
        }
        evenStreetPopulation += arr[arr.length - 1];

        System.out.printf("В домах с %s номерами проживает больше жителей.",
                evenStreetPopulation < oddStreetPopulation ? "нечетными" : "четными");
    }
}
