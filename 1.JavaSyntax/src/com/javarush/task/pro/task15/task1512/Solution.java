package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        outputStream.reset();

        String[] arr = result.split("");
        for (int i = 0; i < arr.length / 2; i++) {
            String b = arr[i];
            arr[i] = arr[result.length() - 1 - i];
            arr[result.length() - 1 - i] = b;
        }
         printSomething(String.join("", arr));
        System.out.println(outputStream);
    }






























    public static void printSomething(String str) {
        stream.print(str);
    }
}