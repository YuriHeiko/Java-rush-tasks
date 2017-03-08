package com.javarush.task.task14.task1421;

public class Singleton {
    private Singleton(){}
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
