package com.javarush.task.pro.task18.task1805;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return 1;
        if (o1.length() < o2.length()) return -1;
        if (o1.length() == o2.length()) return 0;
        return 0;
    }
}
