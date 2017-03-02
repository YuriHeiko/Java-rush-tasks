package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int a, b;
        private char z, x;
        private String f, g;

        public Human() {
            this.a = 1;
            this.b = 1;
            this.z = ' ';
            this.x = ' ';
            this.f = "1";
            this.g = "1";
        }

        public Human(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public Human(char z, char x, String f, String g) {
            this.z = z;
            this.x = x;
            this.f = f;
            this.g = g;
        }

        public Human(String f, String g) {
            this.f = f;
            this.g = g;
        }

        public Human(int a, int b, char z, char x) {
            this.a = a;
            this.b = b;
            this.z = z;
            this.x = x;

        }

        public Human(int a, String f) {
            this.a = a;
            this.f = f;
        }

        public Human(int a, char z, String f) {
            this.a = a;
            this.z = z;
            this.f = f;

        }

        public Human(char z, char x, String g) {
            this.z = z;
            this.x = x;
            this.g = g;
        }

        public Human(char x, String f, String g) {
            this.x = x;
            this.f = f;
            this.g = g;
        }

        public Human(int a, int b, String f, String g) {
            this.a = a;
            this.b = b;
            this.f = f;
            this.g = g;
        }
    }
}
