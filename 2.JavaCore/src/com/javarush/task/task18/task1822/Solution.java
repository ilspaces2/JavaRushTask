package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String str;

        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader bufferedReaderreader = new BufferedReader(new FileReader(reader.readLine()));
        ) {

            while ((str = bufferedReaderreader.readLine()) != null) {
                if (str.startsWith(args[0]+" ")){
                    System.out.println(str);
                    break;
                }
            }
        }


    }
}
