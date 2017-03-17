package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
//       args = new String[]{"-c", "ТРПппп вв", "ж", "15/04/1990", "Тпп в", "м", "31/08/1990", "Ффф АА", "ж", "15/12/990"};
//       args = new String[]{"-u", "1", "ТРПппп вв", "ж", "15/04/1990", "2","Тпп в", "м", "31/08/1990", "3", "Ффф АА", "ж", "15/12/990"};
//       args = new String[]{"-d", "1", "2"};
//       args = new String[]{"-i", "1", "2"};

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        update(args[i], args[i + 1], args[i + 2]);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        update(getId(args[i]), args[i + 1], args[i + 2], args[i + 3]);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        delete(getId(args[i]));
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        print(getId(args[i]));
                    }
                }
                break;
        }

/*
        for (int i = 0; i < allPeople.size(); i++) {
            print(i);
        }
*/
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
