package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = reader.readLine();
            String secondFileName = reader.readLine();
            String thirdFileName = reader.readLine();
            try (FileOutputStream fos = new FileOutputStream(firstFileName);
                 FileInputStream fis1 = new FileInputStream(secondFileName);
                 FileInputStream fis2 = new FileInputStream(thirdFileName)) {
                byte[] bytesFirst = new byte[fis1.available()];
                fis1.read(bytesFirst);
                fos.write(bytesFirst);

                byte[] bytesSecond = new byte[fis2.available()];
                fis2.read(bytesSecond);
                fos.write(bytesSecond);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
