package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;

/*
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) {
        args = new String[]{"d:\\_JavaRush\\_Test_1", "d:\\_JavaRush\\temp.txt"};

        File dir = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File dest = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, dest);
        try (FileOutputStream writer = new FileOutputStream(dest)) {
            ArrayList<File> list = new ArrayList<>();
            Files.walkFileTree(dir.toPath(), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.toFile().length() > 50) FileUtils.deleteFile(file.toFile());
                    else list.add(file.toFile());
                    return FileVisitResult.CONTINUE;
                }
            });
            list.sort(Comparator.comparing(File::getName));
            for (File file : list) {
                System.out.println(file);
                FileReader reader = new FileReader(file);
                while (reader.ready()) writer.write(reader.read());
                reader.close();
                writer.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
}
