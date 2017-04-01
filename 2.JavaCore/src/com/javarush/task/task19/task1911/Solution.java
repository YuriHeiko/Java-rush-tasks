package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(baos);
        PrintStream sysOut = System.out;
        System.setOut(output);
        testString.printSomething();
        System.setOut(sysOut);

        String result = baos.toString().toUpperCase();
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
