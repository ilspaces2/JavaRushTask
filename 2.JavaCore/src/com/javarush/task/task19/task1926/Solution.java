package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file = console.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder str = new StringBuilder();
        while (reader.ready()) {
            str.append(reader.readLine());
        System.out.println(str.reverse());
        str.delete(0,str.length());
        }

        console.close();
        reader.close();
    }
}
