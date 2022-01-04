package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.*;

/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:\\downloads\\YandexDisk\\prog\\java\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task31\\task3112"));
        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        String fileName = urlString.split("/")[urlString.split("/").length - 1];
        Path downloadPath = downloadDirectory.resolve(fileName);



        URL url = new URL(urlString);  //оздаем ссылку

        Path tempFile = Files.createTempFile(null,null);
        InputStream inputStream = url.openStream();  //скачиваем содержимое по ссылки
        Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
         Files.move(tempFile,downloadPath );
        return downloadPath;
    }
}
