package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

/*
Проход по дереву файлов
*/
public class Solution {
    public static TreeSet<String> set = new TreeSet<>(Comparator.comparing(f -> f.substring(f.lastIndexOf("\\"))));

    public static void main(String[] args) {
        args = new String[]{"d:\\_JavaRush\\_Test_1", "d:\\_JavaRush\\_Test\\temp.txt"};

        File file = new File(args[0]);

        readDirectoryAndFillSet(file);

        File forWrite = new File("allFilesContent.txt");

        FileUtils.renameFile(new File(args[1]), forWrite);

        try (FileOutputStream fos = new FileOutputStream(forWrite)) {
            writeAllFiles(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeAllFiles(FileOutputStream fos) {
        for (String s : set) {
            System.out.println(s);
            try (FileInputStream fis = new FileInputStream(s)) {
                byte[] bytes = new byte[fis.available()];
                fis.read(bytes);
                fos.write(bytes);
                fos.write("\\n".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readDirectoryAndFillSet(File file) {
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                readDirectoryAndFillSet(f);
            } else if (f.length() > 50) {
                FileUtils.deleteFile(f);
            } else {
                set.add(f.getAbsolutePath());
            }
        }
    }

    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
}
