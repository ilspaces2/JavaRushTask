package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-1123";
//        System.out.println(changePath(path, jdk13));
        System.out.println(changePathOne(path, jdk13));

/*
        String str = "Good news everyone!";
        String[] strings = str.split("ne");
        System.out.println(Arrays.toString(strings));
*/
    }

    //первый вариант решения
    public static String changePath(String path, String jdk) {
        int startJdk = path.indexOf("jdk");
        int endJdk = path.indexOf("/bin");
        String startPath = path.substring(0, startJdk);  //вырезаем начало строки
        String endPath = path.substring(endJdk, path.length()); // вырезаем конец строки


        return startPath + jdk + endPath;
    }

    //второй вариант решения
    public static String changePathOne(String path, String jdk) {
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex); //вырезаем слово в середине

        return path.replace(oldJdk, jdk);
    }
}
