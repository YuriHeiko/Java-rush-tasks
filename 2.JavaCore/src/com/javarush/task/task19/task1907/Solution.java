package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileReader stream = new FileReader(file);

        String line = "";
        while (stream.ready()){
            line += (char)stream.read();
        }

        line = line.replaceAll("[\\p{Punct}+|\\s]"," ");
        String[] lineArr = line.split(" ");
        int counter = 0;
        for (int i = 0; i < lineArr.length; i++) {
            if (lineArr[i].equals("world")){
                counter = counter + 1;
            }
        }

        System.out.println(counter);

        reader.close();
        stream.close();
    }
}

