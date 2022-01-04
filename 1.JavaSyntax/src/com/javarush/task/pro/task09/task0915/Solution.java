package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));


        String name = "ILYA";
        int age =32;

        String str =String.format("name=%s\nage=%d",name,age);
        System.out.println(str);






    }
    //функция деления строки и запись разделенных слов массив
    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer str = new StringTokenizer(query, delimiter);   //делитель строки
        String[] tokens = new String[6];
        int i =0;
//        if (str.countTokens()>6) return  new String[]{"превышенно колличество токенов: "+Integer.toString(str.countTokens())+", нужно не больше 6",};

        while (str.hasMoreTokens()){
            tokens[i++] = str.nextToken();
        }


        return tokens;
    }
}
