package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов   http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String url = reader.readLine();
        String url1 = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
        String[] newUrl = url1.substring(url1.indexOf("?")+1).split("&");
        for (String s:newUrl) {
            System.out.println(s);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
