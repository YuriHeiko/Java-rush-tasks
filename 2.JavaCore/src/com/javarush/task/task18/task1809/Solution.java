package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileInputStream fis = new FileInputStream(name1);
        FileOutputStream fos = new FileOutputStream(name2);

        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);

        for (int i = bytes.length - 1; i >= 0; i--) {
            fos.write(bytes[i]);
        }

        fis.close();
        fos.close();
    }
}