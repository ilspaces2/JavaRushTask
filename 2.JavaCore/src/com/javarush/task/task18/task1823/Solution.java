package com.javarush.task.task18.task1823;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (!(str = scanner.nextLine()).equals("exit")) {
         new ReadThread(str).start();

        }

        System.out.println(resultMap.entrySet());

    }

    public static class ReadThread extends Thread {

        private volatile String file;

        private volatile int value;

        public ReadThread(String fileName) {
            this.file = fileName;
        }

        public void run() {

            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                int[] array = new int[128];
                while (fileInputStream.available() > 0) array[fileInputStream.read()] += 1;

                int min;
                int max = array[0];

                for (int i = 0; i < array.length; i++) {
                    if (array[i] != 0) {
                        min = array[i];
                        if (max < min) {
                            max = min;
                            value = i;
                        }
                    }
                }
                resultMap.put(file, value);


            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
