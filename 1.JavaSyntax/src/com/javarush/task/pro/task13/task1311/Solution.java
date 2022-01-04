package com.javarush.task.pro.task13.task1311;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Успеваемость студентов-3
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudentsInfo() {
/*
Также можно написать без создания доп переменной entries :
    for (Map.Entry<String,Double> keyPlusValue : grades.entry.Set())

Еще вариант с автоматическим выведением типа данных (var) и без
создания доп переменной:
    for (var keyPlusValue : grades.entry.Set())

*/
        Set<Map.Entry<String, Double>> entries = grades.entrySet();
        for (Map.Entry<String, Double> keyPlusValue : entries) {
            String key = keyPlusValue.getKey();
            Double value = keyPlusValue.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
