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
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = new File("D:\\downloads\\YandexDisk\\prog\\java\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2002\\1");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();

            User user1 = new User();
            user1.setFirstName("Ivan");
            user1.setLastName("Ivanov");
            user1.setBirthDate(new Date());
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);

            javaRush.users.add(user1);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            System.out.println(loadedObject.equals(javaRush));
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {

            PrintWriter printWriter = new PrintWriter(outputStream);
            if (this.users.size() > 0) {
                for (User u : this.users) {
                    printWriter.println(u.getFirstName());
                    printWriter.println(u.getLastName());
                    printWriter.println(u.getBirthDate().getTime());
                    printWriter.println(u.isMale());
                    printWriter.println(u.getCountry());
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (bufferedReader.ready()) {
                User user1 = new User();
                user1.setFirstName(bufferedReader.readLine());
                user1.setLastName(bufferedReader.readLine());
                user1.setBirthDate(new Date(Long.parseLong(bufferedReader.readLine())));
                user1.setMale(Boolean.parseBoolean(bufferedReader.readLine()));
                user1.setCountry(User.Country.valueOf(bufferedReader.readLine()));
                this.users.add(user1);
            }

            bufferedReader.close();


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
