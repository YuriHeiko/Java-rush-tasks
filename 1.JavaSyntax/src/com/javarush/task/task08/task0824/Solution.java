package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Human s1 = new Human("f", true, 65);
        Human s2 = new Human("f", true, 65);
        Human s3 = new Human("f", true, 65);
        ArrayList<Human> list = new ArrayList<>(Arrays.asList(s1, s2, s3));
        Human father = new Human("f", true, 65, list);
        Human mother = new Human("m", false, 65, list);
        Human granpa = new Human("granpa", true, 65, new ArrayList<>(Collections.singletonList(father)));
        Human granpa1 = new Human("granpa", true, 65, new ArrayList<>(Collections.singletonList(mother)));
        Human granma = new Human("granma", false, 65, new ArrayList<>(Collections.singletonList(father)));
        Human granma1 = new Human("granma1", false, 65,new ArrayList<>(Collections.singletonList(mother)));

        System.out.println(granpa);
        System.out.println(granpa1);
        System.out.println(granma);
        System.out.println(granma1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {

            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
