package com.javarush.task.pro.task10.task1021;



public class Car {
    private String model;
    private int year;
    private String color;

    public void initialize(String model,int year,String color){
        this.model=model;
        this.year=year;
        this.color=color;

    }

    public static void main(String[] args) {
        Class a =Car.class;
        System.out.println(a);
        Class b = "s".getClass();
        System.out.println(b);
    }

}
