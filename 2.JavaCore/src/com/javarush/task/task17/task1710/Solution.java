package com.javarush.task.task17.task1710;

import java.text.DateFormat;
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

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 1) {
            throw new RuntimeException();
        }

        if (args[0].equals("-c")) {
            if (args.length < 4) throw new Exception("неправильный формат");

            Person person = null;
            Date inDate = new SimpleDateFormat("dd/MM/yyyy").parse(args[3]);
            if (args[2].equals("м")) allPeople.add(person = Person.createMale(args[1], inDate));
            else if (args[2].equals("ж")) allPeople.add(person = Person.createFemale(args[1], inDate));
            else throw new Exception("неправильный формат");
            System.out.println(allPeople.indexOf(person));


        }
        if (args[0].equals("-r")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            SimpleDateFormat dt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + dt.format(person.getBirthDate()));
        }
        if (args[0].equals("-u")) {
            if (args.length < 5) throw new Exception("неправильный формат");
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            if (args[3].equals("м")) person.setSex(Sex.MALE);
            if (args[3].equals("ж")) person.setSex(Sex.FEMALE);
            Date inDate = new SimpleDateFormat("dd/MM/yyyy").parse(args[4]);
            person.setBirthDate(inDate);
        }

        if (args[0].equals("-d")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }
}
