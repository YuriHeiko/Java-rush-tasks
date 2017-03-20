package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileIS = new FileInputStream(reader.readLine());

        while (fileIS.available() > 999) {
            fileIS.close();
            fileIS = new FileInputStream(reader.readLine());
        }

        reader.close();
        fileIS.close();

        throw new DownloadException();
    }

    public static class DownloadException extends Exception {

    }
}
