package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream(args[0]);

        int[] v = new int[256];
        while (fileReader.available() > 0) {

            v[fileReader.read()] += 1;
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0) System.out.println((char) i + " " + v[i]);
        }
        fileReader.close();

    }
}
