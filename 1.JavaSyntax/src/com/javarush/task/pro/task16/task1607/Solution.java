package com.javarush.task.pro.task16.task1607;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());

        LocalDate date1 =LocalDate.EPOCH;   // юникс дата 1970-01-01
        LocalDate date2 =ofExample();

        //разница между датами по дням
        System.out.println(ChronoUnit.DAYS.between(date1, date2));
//        long days = date1.until(date2, ChronoUnit.DAYS);
    }

    static LocalDate nowExample() {

        return LocalDate.now();
    }

    static LocalDate ofExample() {


        return LocalDate.of(2020, Month.SEPTEMBER, 12);
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код

        return LocalDate.ofYearDay(2020,256);
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код

        return LocalDate.ofEpochDay(18517);
    }
}
