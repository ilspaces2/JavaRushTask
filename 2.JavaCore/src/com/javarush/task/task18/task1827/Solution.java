package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Product> set = new TreeSet<>();
                int max=0;

        String text;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader1 =new BufferedReader(new FileReader(bufferedReader.readLine()))) {
        String nameFile=bufferedReader.readLine();
            while (bufferedReader1.ready()){

                text =bufferedReader1.readLine();
                int id =Integer.parseInt(text.substring(0,8).trim());
                if (id>max) max=id;
            }

            BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("s"));
                    System.out.println(max);

        }



    }
}
