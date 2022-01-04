package com.javarush.task.pro.task16.task1612;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
     Set <LocalDateTime> localDateTimeSet =new HashSet<>();
        for (var dataKey:sourceMap.keySet()) {
            for (var timeKey:sourceMap.get(dataKey)) {
                localDateTimeSet.add(LocalDateTime.of(dataKey,timeKey));
            }
        }

        return localDateTimeSet;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}