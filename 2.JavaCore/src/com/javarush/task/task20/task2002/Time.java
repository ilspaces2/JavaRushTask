package com.javarush.task.task20.task2002;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Time {
    public static void main(String[] args) throws ParseException {
        long date =Long.parseLong("1640376929068");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy" , Locale.ENGLISH);
        String stringDate = simpleDateFormat.format(new Date(date));
        System.out.println(stringDate);
    }
}
