package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();

         zerg1.name = "zerg1";
         zerg2.name = "zerg2";
         zerg3.name = "zerg3";
         zerg4.name = "zerg4";
         zerg5.name = "zerg5";
         zerg6.name = "zerg6";
         zerg7.name = "zerg7";
         zerg8.name = "zerg8";
         zerg9.name = "zerg9";
         zerg10.name = "zerg10";

        Protoss protoss5 = new Protoss();
        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Protoss protoss4 = new Protoss();

       protoss5.name = "zerg5";
       protoss1.name = "zerg1";
       protoss2.name = "zerg2";
       protoss3.name = "zerg3";
       protoss4.name = "zerg4";
        
        Terran terran12 = new Terran();
        Terran terran11 = new Terran();
        Terran terran10 = new Terran();
        Terran terran9 = new Terran();
        Terran terran8 = new Terran();
        Terran terran7 = new Terran();
        Terran terran6 = new Terran();
        Terran terran5 = new Terran();
        Terran terran4 = new Terran();
        Terran terran3 = new Terran();
        Terran terran2 = new Terran();
        Terran terran1 = new Terran();

       terran1.name = "zerg1";
       terran2.name = "zerg2";
       terran3.name = "zerg3";
       terran4.name = "zerg4";
       terran5.name = "zerg5";
       terran6.name = "zerg6";
       terran7.name = "zerg7";
       terran8.name = "zerg8";
       terran9.name = "zerg9";
       terran10.name = "zerg10";
       terran11.name = "zerg11";
       terran12.name = "zerg12";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
