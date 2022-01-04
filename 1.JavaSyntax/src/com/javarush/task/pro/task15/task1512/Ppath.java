package com.javarush.task.pro.task15.task1512;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Ppath {
    public static void main(String[] args)  {

       try ( Scanner scanner =new Scanner(System.in);
        BufferedWriter writer =new BufferedWriter(new FileWriter(String.valueOf(Files.createFile(Path.of(scanner.nextLine())))))){
        writer.write("Hello");
    }catch (IOException err){
       err.printStackTrace();
       }
    }


}
