package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos = new FileOutputStream(reader.readLine())) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream output = new PrintStream(baos);
            PrintStream sysOut = System.out;
            System.setOut(output);
            testString.printSomething();
            System.setOut(sysOut);

            fos.write(baos.toByteArray());
            System.out.println(baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

