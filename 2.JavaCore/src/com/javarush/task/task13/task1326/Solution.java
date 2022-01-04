package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args)  {
        ArrayList<Integer> arr =new ArrayList<>();
      try (BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
           BufferedReader reader1 =new BufferedReader(new FileReader(reader.readLine()))

      ) {
        String nums;
        while ((nums=reader1.readLine())!=null){
            arr.add(Integer.parseInt(nums));
        }
          Collections.sort(arr);
          for (int n:arr) {
              System.out.print(n);
          }

      }catch (IOException e){
          e.printStackTrace();
      }
    }
}
