package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 5;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 5;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 2;
        color = "";
    }

    public Cat(String name, int weight, int age) {

        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "";
    }

    public Cat(String name) {
        this.name = name;
        weight = 2;
        age = 5;
        color = "";
    }

    public static void main(String[] args) {

    }
}
