package com.javarush.task.task3101.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;
/*
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, byte[]> map = new TreeMap<>();
        String direct = args[0];
        File allFilesContent = new File(args[1]);
//        FileUtils.renameFile( allFilesContent, new File(direct.getAbsolutePath() + "\\allFilesContent.txt"));





         class GetFiles extends SimpleFileVisitor<Path>{
             protected GetFiles() {

             }



             @Override
             public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                 return super.visitFile(file, attrs);
             }


         }

//
//        for (File str : direct.listFiles()) {
//            if (str.isFile() && str.length() <= 50) {
//                map.put(str.getName(), str.getAbsolutePath());
//            }
//
//            if (str.isDirectory()) {
//                for (File str1 : str.listFiles()) {
//                    if (str1.isFile() && str1.length() <= 50) {
//                        map.put(str1.getName(), str1.getAbsolutePath());
//
//                    }
//
//                    if (str1.isDirectory()) {
//                        for (File str2 : str1.listFiles()) {
//                            if (str2.isFile() && str2.length() <= 50) {
//                                map.put(str2.getName(), str2.getAbsolutePath());
//
//                            }
//                        }
//                    }
//                }
//            }
//        }

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(allFilesContent));
//        for (Map.Entry<String, String> s : map.entrySet()) {
//            if (!s.getKey().equals("allFilesContent.txt")) {
//                BufferedReader reader = new BufferedReader(new FileReader(s.getValue()));
//                while (reader.ready()) {
//                    String string = reader.readLine();
//                    bufferedWriter.write(string);
//                }
//                bufferedWriter.write("\n");
//                reader.close();
//            }
////            System.out.println(s.getKey()+ " "+s.getValue());
//        }
//        bufferedWriter.close();
    }
}