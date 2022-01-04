package com.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    public Programmer() {
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary= Math.max(salary,this.salary);
    }
    //напишите тут ваш код
    public static void main(String[] args) {
        Programmer programmer =new Programmer();
        System.out.println(programmer.getSalary());
        programmer.setSalary(2100);
        System.out.println(programmer.getSalary());
        programmer.setSalary(500);
        System.out.println(programmer.getSalary());

    }
   


}
