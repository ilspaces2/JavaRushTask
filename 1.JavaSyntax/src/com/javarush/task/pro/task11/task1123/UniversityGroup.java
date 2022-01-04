package com.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.List;

/* 
Почувствуй себя деканом
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        this.students = new ArrayList<>();
        this.students.add("Сергей Фрединский");
        this.students.add("Виталий Правдивый");
        this.students.add("Максим Козыменко");
        this.students.add("Наталия Андрющенко");
        this.students.add("Ира Величенко");
        this.students.add("Николай Соболев");
        this.students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        this.students.removeIf(student -> student.equals(excludedStudent));
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
//        System.out.println(universityGroup);
    }
}