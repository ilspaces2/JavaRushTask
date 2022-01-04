package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла из интернета или сохранение файла в директорию
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        InputStream input = url.openStream();

        /*   создаем верменный файл(можно указать директорию название расширение файла)
             считываем данные в буфер
             пишем в нужный файл данные из буфера
         */
        Path path = Files.createTempFile(null, null);
        byte[] buffer = input.readAllBytes();
        Files.write(path, buffer);


        /*
        копируем файл в указанный путь. не забываем указать название файла
        Path path = Path.of("C:\\Users\\Администратор\\Desktop\\Git-2.33.1-64-bit.exe");
        Files.copy(input,path);
         */


    }
}