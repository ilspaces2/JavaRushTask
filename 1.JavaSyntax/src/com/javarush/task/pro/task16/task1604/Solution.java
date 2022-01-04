package com.javarush.task.pro.task16.task1604;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/
enum DayWeekRusLang {
    Воскресенье,
    Понедельник,
    Вторник,
    Среда,
    Четверг,
    Пятница,
    Суббота,

}


public class Solution {

    static Calendar birthDate = new GregorianCalendar(1988, Calendar.NOVEMBER, 5);

    static ArrayList<String> dayWeeks = new ArrayList<>(Arrays.asList("Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"));

    public static void main(String[] args) {

        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
//        DayWeekRusLang.values()[calendar.get(Calendar.DAY_OF_WEEK)-1].toString();
        return dayWeeks.get(calendar.get(Calendar.DAY_OF_WEEK)-1);
    }
}
