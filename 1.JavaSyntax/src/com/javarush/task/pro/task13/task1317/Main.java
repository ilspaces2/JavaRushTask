package com.javarush.task.pro.task13.task1317;

import java.util.Arrays;
import java.util.Objects;

public class Main {


    public static void main(String[] args) {
        Month[] month = Month.values();

        for (Month m:month
             ) {
          String str =m.toString();
            System.out.println(str);
        }

    }
}
