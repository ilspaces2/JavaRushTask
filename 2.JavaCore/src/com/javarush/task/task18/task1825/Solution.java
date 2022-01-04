package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        saveFiles();
    }


    public static void saveFiles() throws IOException {
        Set<String> map = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mainFile = null;
        String str;
        while (!(str = reader.readLine()).equals("end")) {
            if (mainFile == null) {
                int suffix = str.indexOf(".part");
                mainFile = str.substring(0, suffix);
            }
            map.add(str);
        }
        reader.close();
        FileOutputStream fileOutputStream =new FileOutputStream(mainFile);
        for (String s : map) {
                FileInputStream fileInputStream =new FileInputStream(s);
                byte[] buffer =new byte[fileInputStream.available()];
                int text= fileInputStream.read(buffer);

            fileOutputStream.write(buffer,0,text);
            fileInputStream.close();
        }
        fileOutputStream.close();

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(mainFile));
//        for (String s : map.values()) {
//            bufferedWriter.write(s);
//        }
//        bufferedWriter.close();
    }
}
