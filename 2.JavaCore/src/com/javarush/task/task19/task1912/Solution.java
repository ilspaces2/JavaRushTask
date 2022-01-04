package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws FileNotFoundException {
        // это стандартный вывод
        PrintStream defaultStream =System.out;
        ByteArrayOutputStream outputStream =new ByteArrayOutputStream();
        PrintStream newStream =new PrintStream(outputStream);
        System.setOut(newStream);
        testString.printSomething();
        String result = outputStream.toString();
        String newResult =result.replaceAll("te","??");
        System.setOut(defaultStream);
        System.out.println(newResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
