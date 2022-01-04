package com.javarush.task.pro.task15.task1504;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()));
        InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));



        byte[] buffer = inputStream.readAllBytes();
        byte b = buffer[0];

        for (int i = 0; i < buffer.length; i++) {
            if (i % 2 == 0) {
                b = buffer[i];
            }
            if (i % 2 == 1) {
                buffer[i - 1] = buffer[i];
                buffer[i] = b;
            }
        }
        outputStream.write(buffer);


       inputStream.close();
       outputStream.close();
    }
}

