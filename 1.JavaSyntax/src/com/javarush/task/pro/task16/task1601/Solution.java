package com.javarush.task.pro.task16.task1601;

import java.util.Arrays;
import java.util.Date;

enum DayOfWeekRus {
    Воскресенье,
    Понедельник,
    Вторник,
    Среда,
    Четверг,
    Пятница,
    Суббота,
}


public class Solution {

    static Date birthDate = new Date(88, 10, 6);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));

    }

    static String getDayOfWeek(Date date) {
        return DayOfWeekRus.values()[date.getDay()].toString();
    }
}
