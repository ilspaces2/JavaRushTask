package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>b && (a&b)==0)System.out.println("Общий делитель "+b);
        if (a<b && (b&a)==0)System.out.println("Общий делитель "+a);

    }
}
