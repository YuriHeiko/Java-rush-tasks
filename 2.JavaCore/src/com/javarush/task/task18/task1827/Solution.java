package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
//        args = new String[]{"-c", "123456789012345678901234567890", "12345678", "1234"};
//        args = new String[]{"-c", "30", "8", "4"};
//        args = new String[]{"-c", "Куртка для сноубордистов, разм", "10173.99", "1234"};
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
//            String fileName = "d:\\_JavaRush\\_Test\\task18.task1827.txt ";
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                String line;
                int maxId = 0;
                List<String> list = new LinkedList<>();
                while ((line = fileReader.readLine()) != null) {
                    list.add(line);

                    if (maxId < Integer.parseInt(line.substring(0, 8).trim())) {
                        maxId = Integer.parseInt(line.substring(0, 8).trim());
                    }
                }
                try (FileOutputStream fos = new FileOutputStream(fileName)) {
                    for (String s : list) {
                        fos.write((String.format("%s%n", s)).getBytes());
                    }

                    fos.write(String.format("%-8s%-30s%-8s%-4s%n", ++maxId, args[1], args[2], args[3]).getBytes());
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
