package com.javarush.task.task13.task1305;

/* 
4 ошибки
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

    interface Desire {
    }

    interface Dream {
        Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Dream,Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
