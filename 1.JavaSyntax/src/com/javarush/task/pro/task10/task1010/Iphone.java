package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //определили свой метод сравнения переменных в объектах
    //если переменные текстовые то их лучше сравнивать с помощью equals + проверка на null
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Iphone iphone = (Iphone) obj;
        return this.model.equals(iphone.model) && this.color.equals(iphone.color) && this.price == iphone.price;
    }
    //напишите тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);


        System.out.println(iphone1.hashCode());
        System.out.println(iphone2.hashCode());
        System.out.println(iphone1.equals(iphone2));
    }

}
