package com.javarush.task.pro.task10.task1011;

import com.javarush.task.pro.task10.task1010.Iphone;

import java.util.Objects;

/* 
Создаем свой hashCode
*/

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    /*
        hashCode работает быстрее чем иквалс, используется для не точного сравнения
        Метод hashCode() работает по похожему принципу. Если его вызвать у объекта, то он вернет некое число — аналог первой буквы в слове. Это число обладает такими свойствами:

У одинаковых объектов всегда одинаковые hash-code
У разных объектов могут быть одинаковые hash-code, а могут быть разные
Если у объектов разные hash-code, объекты точно разные
Для большего понимания перепишем эти свойства относительно слов:

У одинаковых слов всегда одинаковые первые буквы
У разных слов могут быть одинаковые первые буквы, а могут быть и разные
Если у слов разные первые буквы, слова точно разные
Последнее свойство и используется для ускоренного сравнения объектов:

Сначала у двух объектов вычисляются hash-code. Если эти hash-code разные, то объекты точно разные, и сравнивать их дальше не нужно.

А вот если hash-code одинаковые, придется все же сравнивать объекты с помощью equals.


        Если пишешь свой hashCode() то необходимо и написать свой equals()
        и  наоборот(Такая договоренность называется контрактом.)
    */




    public int hashCode() {

//        Objects.hashCode(year);
//        Objects.hashCode(model)  - для одного объекта,  .hash(model,year)- для нескольких обектов
        return Objects.hash(model, year);
    }

    //допишем свой equals(obj)
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Car car = (Car) obj;
        return this.model.equals(car.model) && this.year == car.year;
    }


    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini1 = new Car("Lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car ferrari1 = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        Car bugatti1 = new Car("Bugatti", 2020);


        System.out.println(lamborghini.equals(lamborghini1));

        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
