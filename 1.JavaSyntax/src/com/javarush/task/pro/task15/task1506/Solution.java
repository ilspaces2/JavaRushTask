package com.javarush.task.pro.task15.task1506;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/
public class Solution {
    public static void main(String[] args) throws IOException {
//        String path ="/Users/ilya/IdeaProjects/JavaRushTasks/JavaRushTasks/1.JavaSyntax/src/com/javarush/task/pro/task15/task1506/1.txt";
        Scanner scanner = new Scanner(System.in);
        List<String> in = Files.readAllLines(Paths.get(scanner.nextLine()));
        for (String l:in) {
            System.out.println(l.replaceAll("\\.|,|\\s", ""));

        }





    }
}


