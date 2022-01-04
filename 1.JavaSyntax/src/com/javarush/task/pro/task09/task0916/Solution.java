package com.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(format("Амиго", 5000));

        String s = String.format("a=%3$d, b=%2$d, c=%d", 11, 12, 13);   //%2$ определяет какую переменную возмем по счету. получается b=12
    }

    public static String format(String name, int salary) {
        String phrase = String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.",name,salary);
        return phrase;
    }
}
