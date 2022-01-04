package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor student1, JavaRushMentor student2) {
        if (student1.getName().length() > student2.getName().length()) return 1;
        if (student1.getName().length() < student2.getName().length()) return -1;
        if (student1.getName().length() == student2.getName().length()) return 0;

        return 0;
    }
    //напишите тут ваш код
}
