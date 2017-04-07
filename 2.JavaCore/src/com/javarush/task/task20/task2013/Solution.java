package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeObject(father);
            out.writeObject(mother);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            father = (Person)in.readObject();
            mother = (Person)in.readObject();
            age = in.readInt();
            children = (List)in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("3", "3", 25);
        person.setFather(new Person("1", "1", 45));
        person.setMother(new Person("2", "2", 43));
        person.setChildren(Arrays.asList(new Person("4", "4", 2), new Person("5", "5", 1)));

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("d:\\test"));
        person.writeExternal(outputStream);

        Person p = new Person("1", "2", 2);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("d:\\test"));
        p.readExternal(inputStream);

        System.out.println(person);
        System.out.println(p);
    }

}

