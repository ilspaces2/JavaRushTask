package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ) {
            StringBuilder data = new StringBuilder();
            StringBuilder name = new StringBuilder();

            while (reader.ready()) {
                String[] str = reader.readLine().split(" ");

                for (String s : str) {
                    if (s.matches("\\d+")) {
                        data.append(s + "-");
                    } else name.append(s + " ");
                }
                //получаем полученные строки. удаляем последний элемент (- и пробел)
                String finalDataString = data.substring(0, data.length() - 1);
                String finalNameString = name.substring(0, name.length() - 1);

                //очищаем стринг билдеры чтобы добавлять новые строки
                data.delete(0, data.length());
                name.delete(0, name.length());

                //парсим дату
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date birthDate = simpleDateFormat.parse(finalDataString);

                // добавляем в лист имя и дату
                PEOPLE.add(new Person(finalNameString, birthDate));
            }

            //проверка полученного листа
            for (Person s : PEOPLE) {
                System.out.print(s.getName());
                System.out.print(s.getBirthDate());
                System.out.println();
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }
}
