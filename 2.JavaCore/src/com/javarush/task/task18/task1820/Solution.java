package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Scanner;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (
                Scanner scanner = new Scanner(System.in);
                FileReader fileReader = new FileReader(scanner.nextLine());
                FileWriter fileOutputStream = new FileWriter(scanner.nextLine());

        ) {
            String str = "";
            while (fileReader.ready()) str += (char) fileReader.read();

            String[] arr = str.split(" ");
            for (String s : arr) fileOutputStream.write(Math.round(Float.parseFloat(s)) + " ");
        }


    }


}

