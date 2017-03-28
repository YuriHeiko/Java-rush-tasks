package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            SimpleDateFormat sdFormat = new SimpleDateFormat("ddMMyyyy");
            Date date = null;

            String lName = fileScanner.next();
            String fName = fileScanner.next();
            String sName = fileScanner.next();
            try
            {
                date = sdFormat.parse(fileScanner.next() + fileScanner.next() + fileScanner.next());
            } catch (ParseException e){}

            return new Person(fName, sName, lName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
