package com.javarush.task.pro.task13.task1319;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[]  getWinterMonths(){
        Month[] month=new Month[3];
            month[0]=Month.values()[11];
            month[1]=Month.values()[0];
            month[2]=Month.values()[1];
        return month;
    }

    public static Month[]  getSpringMonths(){
        Month[] month=new Month[3];
        month[0]=Month.values()[2];
        month[1]=Month.values()[3];
        month[2]=Month.values()[4];

        return month;
    }

    public static Month[]  getSummerMonths(){
        Month[] month=new Month[3];
        month[0]=Month.values()[5];
        month[1]=Month.values()[6];
        month[2]=Month.values()[7];
        return month;
    }

    public static Month[]  getAutumnMonths(){
        Month[] month=new Month[3];
        month[0]=Month.values()[8];
        month[1]=Month.values()[9];
        month[2]=Month.values()[10];
        return month;
    }
}
