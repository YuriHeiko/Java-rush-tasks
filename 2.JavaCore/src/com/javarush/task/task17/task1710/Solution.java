package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
//       args = new String[]{"-c", "ТРПппп вв", "ж", "15/04/1990"};
//       args = new String[]{"-u", "1","ТРПппп вв", "ж", "01/01/1999"};
//       args = new String[]{"-d", "1"};
//       args = new String[]{"-i", "1"};

        switch (args[0]) {
            case "-c":
                update(args[1], args[2], args[3]);
                break;
            case "-u":
                update(getId(args[1]), args[2], args[3], args[4]);
                break;
            case "-d":
                delete(getId(args[1]));
                break;
            case "-i":
                print(getId(args[1]));
                break;
        }

        for (int i = 0; i < allPeople.size(); i++) {
            print(i);
        }
    }

    public static int getId(String idStr) {
        int id = 0;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return id;
    }

    public static void print(int id) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = allPeople.get(id);
        if (person.getSex() == Sex.MALE) {
            System.out.printf("%s %s %s%n", person.getName(), "м", simpleDateFormat.format(person.getBirthDay()));
        } else {
            System.out.printf("%s %s %s%n", person.getName(), "ж", simpleDateFormat.format(person.getBirthDay()));
        }
    }

    public static void delete(int id) {
        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDay(null);
    }

    public static void update(int id, String name, String sex, String date) throws ParseException {
        Person person = allPeople.get(id);
        person.setName(name);
        if (sex.equals("м")) {
            person.setSex(Sex.MALE);
        } else if (sex.equals("ж")) {
            person.setSex(Sex.FEMALE);
        }
        person.setBirthDay(sdf.parse(date));
    }

    public static void update(String name, String sex, String date) throws ParseException {
        if (sex.equals("м")) {
            allPeople.add(Person.createMale(name, sdf.parse(date)));
        } else if (sex.equals("ж")) {
            allPeople.add(Person.createFemale(name, sdf.parse(date)));
        }
        System.out.println(allPeople.size() - 1);
    }
}
