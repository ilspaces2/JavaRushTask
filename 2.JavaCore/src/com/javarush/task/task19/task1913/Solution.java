package com.javarush.task.task19.task1913;

import java.io.*;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream defaultSystemOut =System.out;

        //динамический массив для вывода
        FileOutputStream fileOutputStream =new FileOutputStream("D:\\downloads\\YandexDisk\\prog\\java\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1913\\1");
        PrintStream newSystemOut =new PrintStream(fileOutputStream);
        System.setOut(newSystemOut);
        testString.printSomething();
//        newSystemOut.println();
//        String rez= stream.toString();
        System.setOut(defaultSystemOut);
//        System.out.println(rez);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
