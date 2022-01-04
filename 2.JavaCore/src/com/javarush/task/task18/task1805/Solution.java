package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        FileInputStream fileInputStream =new FileInputStream(scanner.nextLine());

        Set <Integer> in =new HashSet<>();

        while (fileInputStream.available()>0){
            in.add(fileInputStream.read());
        }
        in.stream().sorted().forEach(el-> System.out.print(el+" "));



        scanner.close();
        fileInputStream.close();
    }
}
