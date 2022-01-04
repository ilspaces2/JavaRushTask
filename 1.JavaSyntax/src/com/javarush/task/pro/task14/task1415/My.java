package com.javarush.task.pro.task14.task1415;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class My {


    public void bufer() throws IOException{ //либо бросаем исключение дальше и уже обрабатываем его там где вызывается функция
//        try {   //либо его обрабатываем сами

            BufferedReader bufferedReader= new BufferedReader(new FileReader("c"));
            String str =bufferedReader.readLine();
            System.out.println(str);
//
//        } catch (IOException err){
//            System.out.println("err");
//        }finally {
//            System.out.println("файл не найден, завершаем работу");
//
//        }


    }



    public static void main(String[] args) {
       My my=new My();
     try {
         my.bufer();

     }catch (IOException err){
         System.out.println("err");
     }
    }

}
