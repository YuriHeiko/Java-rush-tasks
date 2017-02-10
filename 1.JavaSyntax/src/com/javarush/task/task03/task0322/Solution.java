package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.format("%s + %s + %s = Чистая любовь, да-да!", reader.readLine(), reader.readLine(), reader.readLine());
        }
    }
}