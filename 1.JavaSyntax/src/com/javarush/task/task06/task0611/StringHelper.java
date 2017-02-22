package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";

        result = multiply(s, 5);

        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(s);
        }
        result = builder.toString();

        return result;
    }

    public static void main(String[] args) {

    }
}
