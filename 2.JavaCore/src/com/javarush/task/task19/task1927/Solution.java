package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream defaultOut =System.out;
        ByteArrayOutputStream stream =new ByteArrayOutputStream();
        PrintStream printStream =new PrintStream(stream);
        System.setOut(printStream);
        testString.printSomething();
        String[] str =stream.toString().split("\\n");
        System.setOut(defaultOut);
        for (int i = 0; i <str.length ; i++) {
            System.out.println(str[i]);
            if ((i+1)%2==0) System.out.println("JavaRush - курсы Java онлайн");
        }



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
