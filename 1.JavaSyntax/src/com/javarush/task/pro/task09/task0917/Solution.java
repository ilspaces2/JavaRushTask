package com.javarush.task.pro.task09.task0917;

/* 
String pool
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));


        String a=new String("Hello");
        String b= "Hello";

        String c= b.intern();
        System.out.println(b.intern());


    }

    public static boolean equal(String first, String second) {
        //напишите тут ваш код
        return first.intern()==second.intern();
    }
}
