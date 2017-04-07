package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(new Solution(4));

        ObjectOutputStream objOS = new ObjectOutputStream(new FileOutputStream("d:/ser.txt"));
        Solution savedObject = new Solution(4);
        objOS.writeObject(savedObject);
        objOS.flush();
        objOS.close();

        Solution loadedObject = new Solution(10);
        System.out.println(loadedObject);
        ObjectInputStream objectIS = new ObjectInputStream(new FileInputStream("d:/ser.txt"));
        loadedObject = (Solution) objectIS.readObject();
        System.out.println(loadedObject);

        if (savedObject.string.equals(loadedObject.string))
            System.out.println("Strings are equal");
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
