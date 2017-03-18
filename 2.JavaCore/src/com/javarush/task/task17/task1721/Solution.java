package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
//        firstFile = "d:\\_JavaRush\\_Test\\task17.task1721_1.txt";
        allLines = Files.readAllLines(Paths.get(firstFile), StandardCharsets.UTF_8);
        String secondFile = reader.readLine();
//        secondFile = "d:\\_JavaRush\\_Test\\task17.task1721_2.txt";
//        secondFile = "d:\\_JavaRush\\_Test\\task17.task1721_3.txt";
        forRemoveLines = Files.readAllLines(Paths.get(secondFile), StandardCharsets.UTF_8);
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
