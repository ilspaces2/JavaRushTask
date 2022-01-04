package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {

        initEmployees();
        paySalary("ы");

        //передаем аррэйЛист в массив строк
        String[]asd=new String[waitingEmployees.size()];
        waitingEmployees.toArray(asd);
        System.out.println(asd[0]);
        //
    }

    public static void paySalary(String name) {
        if (name == null || !waitingEmployees.contains(name)) System.out.println("null или имя отсутствует");
        else {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);

        }
    }
}
