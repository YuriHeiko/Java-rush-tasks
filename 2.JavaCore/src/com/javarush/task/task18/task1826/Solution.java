package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
//        args = new String[]{"-e", "d:\\_JavaRush\\_Test\\Dear Sir or Madam.txt", "d:\\_JavaRush\\_Test\\temp.txt"};
//        args = new String[]{"-d", "d:\\_JavaRush\\_Test\\temp.txt", "d:\\_JavaRush\\_Test\\Dear Sir or Madam.txt"};

        encryptDecryptFile(args[1], args[2]);
    }

    public static void encryptDecryptFile(String sourceFileName, String destinationFileName) {
        try (FileInputStream fis = new FileInputStream(sourceFileName);
             FileOutputStream fos = new FileOutputStream(destinationFileName)) {
            while (fis.available() > 0) {
                fos.write(fis.read() ^ 0b11111111);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
