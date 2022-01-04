package com.javarush.task.task20.task2026;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File folder = new File("d:/");
        for (File file : folder.listFiles())
        {
            System.out.println(file.length());
        }
    }
}
