package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream s =System.out;
        ByteArrayOutputStream array =new ByteArrayOutputStream();
        PrintStream printStream =new PrintStream(array);
        System.setOut(printStream);
        testString.printSomething();
        String str =array.toString().replaceAll("\\n","9");
        System.setOut(s);
        System.out.println(str);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

