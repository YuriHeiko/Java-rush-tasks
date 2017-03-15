package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new One());
        threads.add(new Two());
        threads.add(new Three());
        threads.add(new Four());
        threads.add(new Five());
    }

    public static void main(String[] args) {
    }
}

class One extends Thread {
    @Override
    public void run() {
        while (true) {}
    }
}

class Two extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
}

class Three extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Ура");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Four extends Thread implements Message {

    @Override
    public void run() {
        while (!isInterrupted()) {}
    }

    @Override
    public void showWarning() {
        interrupt();
    }
}

class Five extends Thread {

    @Override
    public void run() {
        String line;
        int result = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(line = reader.readLine()).equals("N")) {
                result += Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}