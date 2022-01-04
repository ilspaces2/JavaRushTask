package com.javarush.task.pro.task12.task1202;

import java.util.ArrayList;

public class Alist {

   public static ArrayList<String> arrayList=new ArrayList<>();

    public static void main(String[] args) {

        arrayList.add("33r");
        arrayList.add("123");
        arrayList.add("111113");
        arrayList.add("23");
        arrayList.remove("123");

        System.out.println(arrayList);

    }

}
