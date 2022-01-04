package com.javarush.task.pro.task17.task1703;

import java.util.ArrayList;

/* 
Космическая одиссея ч.1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        Astronaut human1 =new Human();
        Astronaut human2 =new Human();
        Astronaut cat =new Cat();
        Astronaut dog =new Dog();
        astronauts.add(human1);
        astronauts.add(human2);
        astronauts.add(dog);
        astronauts.add(cat);
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
