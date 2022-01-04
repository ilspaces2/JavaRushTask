package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/* 
Продвинутый поиск файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();
String path="D:\\downloads\\YandexDisk\\prog\\java\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task31\\task3111";


//        searchFileVisitor.setPartOfName("amigo");
//        searchFileVisitor.setPartOfContent("");
//        searchFileVisitor.setMinSize(11);
//        searchFileVisitor.setMaxSize(3000);
//
        Files.walkFileTree(Paths.get(path), searchFileVisitor);
//
        List<Path> foundFiles = searchFileVisitor.getFoundFiles();
        for (Path file : foundFiles) {
            System.out.println(file);
        }
    }

}
