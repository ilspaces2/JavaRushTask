package com.javarush.task.pro.task16.task1603;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Чиним формат
*/

public class Solution {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));


        Calendar calendar1 =Calendar.getInstance();
        System.out.println(calendar1.getTime());
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
    }
}