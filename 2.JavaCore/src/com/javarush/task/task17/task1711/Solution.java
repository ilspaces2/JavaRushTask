package com.javarush.task.task17.task1711;


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

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat showDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);



    public static void main(String[] args) throws Exception {

        try {
             Date birthDay;
             Person person = null;

            switch (args[0]) {

                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length - 1; i += 3) {
                            birthDay = inputDateFormat.parse(args[i + 2]);
                            if (args[i + 1].equals("м")) person = Person.createMale(args[i], birthDay);
                            if (args[i + 1].equals("ж")) person = Person.createFemale(args[i], birthDay);
                            allPeople.add(person);
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;

                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length - 1; i += 4) {
                            person = allPeople.get(Integer.parseInt(args[i]));
                            birthDay = inputDateFormat.parse(args[i + 3]);
                            person.setName(args[i + 1]);
                            person.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                            person.setBirthDate(birthDay);
                        }
                    }
                    break;

                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            person = allPeople.get(Integer.parseInt(args[i]));
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                    break;

                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            person = allPeople.get(Integer.parseInt(args[i]));
                            birthDay = person.getBirthDate();
                            System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + showDateFormat.format(birthDay));
                        }
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

