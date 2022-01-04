package com.javarush.task.pro.task17.task1707;

public class Dog extends Pet {
    public static final String DOG = "Я люблю людей.";

    public void printInfo(){
        super.printInfo();          //начала вызываем метод класса родителя
        System.out.println(DOG);    // дальше исполняется метод наследника
    }
}
