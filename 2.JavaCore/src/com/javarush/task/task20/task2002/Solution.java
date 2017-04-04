package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            User user1 = new User();
            user1.setFirstName("1");
            user1.setLastName("11");
            user1.setBirthDate(simpleDateFormat.parse("11 01 2001"));
            user1.setMale(true);
            user1.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user1);
            User user2 = new User();
            user2.setFirstName("2");
            user2.setLastName("22");
            user2.setBirthDate(simpleDateFormat.parse("02 10 2002"));
            user2.setMale(false);
            user2.setCountry(User.Country.OTHER);
            javaRush.users.add(user2);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            for (User u : loadedObject.users) {
                System.out.println(u.getFirstName() + " " + u.getLastName() + " " + u.getCountry() + " " + u.getBirthDate());
            }

            System.out.println(javaRush.equals(loadedObject));


            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

            for (User user : users) {
                printWriter.println(user.getFirstName());
                printWriter.println(user.getLastName());
                printWriter.println(sdf.format(user.getBirthDate()));
                printWriter.println(user.isMale());
                printWriter.println(user.getCountry());
            }
            printWriter.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

            String firstName;
            while ((firstName = reader.readLine()) != null) {
                    User user = new User();
                    user.setFirstName(firstName);
                    user.setLastName(reader.readLine());
                    user.setBirthDate(sdf.parse(reader.readLine()));
                    user.setMale(Boolean.parseBoolean(reader.readLine()));
                    user.setCountry(User.Country.valueOf(reader.readLine()));
                    users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
