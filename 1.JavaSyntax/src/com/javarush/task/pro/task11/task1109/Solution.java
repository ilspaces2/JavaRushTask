package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
       Outer.Inner inner=new Outer().new Inner(); //создали обычный внутренний класс

       Outer.Nested nested=new Outer.Nested(); //создали статический вложенный класс
    }
}
