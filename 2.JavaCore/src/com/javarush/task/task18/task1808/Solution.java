package com.javarush.task.task18.task1808;

/* 
Разделение файла

d:\_JavaRush\_Test\task17.task1721_2.txt
d:\_JavaRush\_Test\task17.task1721_tmp1.txt
d:\_JavaRush\_Test\task17.task1721_tmp2.txt
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileInputStream fis = new FileInputStream(name);
        FileOutputStream fos1 = new FileOutputStream(name1);
        FileOutputStream fos2 = new FileOutputStream(name2);

        byte[] bytes = new byte[fis.available()];
        int count = fis.read(bytes);
        fos1.write(bytes, 0, count / 2 + count % 2);
        fos2.write(bytes, count / 2 + count % 2, count / 2);

        fis.close();
        fos1.close();
        fos2.close();
        reader.close();
    }
}
