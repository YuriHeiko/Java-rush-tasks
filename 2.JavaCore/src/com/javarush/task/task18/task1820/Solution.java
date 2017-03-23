package com.javarush.task.task18.task1820;

/* 
Округление чисел

d:\_JavaRush\_Test\18.10.05.txt
d:\_JavaRush\_Test\temp.txt
3 4 10 13 12 0 3 500 10001 1001 -3
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String firstFileName;
        String secondFileName = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            try (Scanner scanner = new Scanner(new FileReader(firstFileName));
                 FileWriter writer = new FileWriter(secondFileName)) {
                while (scanner.hasNext()) {
                    writer.write(Math.round(Double.parseDouble(scanner.next())) + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader fReader = new BufferedReader(new FileReader(secondFileName))) {
            System.out.println(fReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
