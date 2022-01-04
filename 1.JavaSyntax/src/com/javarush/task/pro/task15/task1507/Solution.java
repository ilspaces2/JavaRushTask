package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
//              String path ="/Users/ilya/IdeaProjects/JavaRushTasks/JavaRushTasks/1.JavaSyntax/src/com/javarush/task/pro/task15/task1507/1.txt";

        List <String> list =Files.readAllLines(Paths.get(scanner.nextLine()));
        for (int i = 0; i <list.size() ; i+=2) {
            System.out.println(list.get(i));
        }

    }
}

