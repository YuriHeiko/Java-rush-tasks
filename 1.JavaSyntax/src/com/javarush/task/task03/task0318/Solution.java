package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int years = Integer.valueOf(reader.readLine());
        System.out.println(String.format("%s захватит мир через %d лет. Му-ха-ха!", reader.readLine(), years));
    }
}
