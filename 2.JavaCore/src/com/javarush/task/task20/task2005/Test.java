package com.javarush.task.task20.task2005;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Tom", 2);
        FileOutputStream fileOutputStream =new FileOutputStream("D:\\downloads\\YandexDisk\\prog\\java\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2005\\1");
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cat);
        fileOutputStream.close();
        objectOutputStream.close();


        FileInputStream fileInputStream =new FileInputStream("D:\\downloads\\YandexDisk\\prog\\java\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2005\\1");
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
        Object obj = objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        Cat cat1 = (Cat) obj;
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());




    }

    static class Cat implements Serializable {
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

}
