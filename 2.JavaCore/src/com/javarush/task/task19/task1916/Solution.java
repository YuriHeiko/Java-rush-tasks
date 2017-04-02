package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения

http://info.javarush.ru/JavaRush_tasks_discussion/2013/10/02/level19-lesson10-bonus01.html#comment60436
http://info.javarush.ru/JavaRush_tasks_discussion/2016/02/14/level19-lesson10-bonus01-%D0%93%D1%80%D0%B0%D1%84%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B5-%D0%BF%D0%BE%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5-%D1%83%D1%81%D0%BB%D0%BE%D0%B2%D0%B8%D1%8F-%D0%B7%D0%B0%D0%B4%D0%B0%D1%87%D0%B8-.html
http://info.javarush.ru/JavaRush_tasks_discussion/2013/10/02/level19-lesson10-bonus01.html#comment22295

file1: 1 4 5
file2: 2 1 3 4 5 6
output: А2 S1 A3 S4 S5 A6
file1: 1 2 3
file2: 1 3 4
ouput: S1 R2 S3 A4
file1: 1 1
file2: 1 2 1
ouput: S1 A2 S1
file1: 1 2 1
file2: 2 3 1 4
ouput: R1 S2 A3 S1 A4
file1: 1 2 3 4
file2: 1 3
ouput: S1 R2 S3 R4
file1: 1 2 3 5
file2: 0 1 3 4 5 6
ouput: A0 S1 R2 S3 A4 S5 A6

d:\_JavaRush\_Test\19.10.b01_1.txt
d:\_JavaRush\_Test\19.10.b01_2.txt
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader1 = new FileReader(reader.readLine());
             FileReader fileReader2 = new FileReader(reader.readLine())) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
