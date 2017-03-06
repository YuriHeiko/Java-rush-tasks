package com.javarush.task.task13.task1309;

/* 
Наследование интерфейса
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Movable {
        Double speed();
    }

    public interface Flyable extends Movable {
        Double speed(Flyable flyable);
    }
}