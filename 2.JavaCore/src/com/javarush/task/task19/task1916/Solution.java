package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String file1 = scanner.readLine();
        String file2 = scanner.readLine();
        scanner.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));

        List<String> oldFile = new ArrayList<>();
        List<String> newFile = new ArrayList<>();
        while (reader1.ready()) {
            oldFile.add(reader1.readLine());
        }
        reader1.close();
        while (reader2.ready()) {
            newFile.add(reader2.readLine());
        }
        reader2.close();



    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
