package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        FileInputStream fileInputStream =new FileInputStream(scanner.nextLine());

        int min =fileInputStream.read();
        while (fileInputStream.available()>0){
            int max =fileInputStream.read();
            if (max<min) min=max;
        }
        scanner.close();
        fileInputStream.close();
        System.out.println(min);


    }
}
