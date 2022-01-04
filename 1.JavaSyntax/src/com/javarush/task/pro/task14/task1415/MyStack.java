package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0,s);
    }

    public String pop() {
        String pop =storage.get(0);
        storage.remove(pop);
        return pop;
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
      return  storage.isEmpty();
    }

    public int search(String s) {
        return storage.indexOf(s);
    }


    public static void main(String[] args) {
        MyStack a = new MyStack();
        a.push("1");
        a.push("2");
        a.push("3");
        a.push("4");
        a.pop();



        System.out.println(a.search("4"));

    }

}
