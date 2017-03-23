package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = reader.readLine();
            String secondFileName = reader.readLine();
            try (FileInputStream fis1 = new FileInputStream(firstFileName);
                 FileInputStream fis2 = new FileInputStream(secondFileName)) {
                byte[] bytesFirst = new byte[fis1.available()];
                fis1.read(bytesFirst);

                byte[] bytesSecond = new byte[fis2.available()];
                fis2.read(bytesSecond);

                try (FileOutputStream fos = new FileOutputStream(firstFileName)) {
                    fos.write(bytesSecond);
                    fos.write(bytesFirst);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
