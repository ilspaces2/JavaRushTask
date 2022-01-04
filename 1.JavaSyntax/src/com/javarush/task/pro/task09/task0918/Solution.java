package com.javarush.task.pro.task09.task0918;

/* 
Поработаем со StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    //добавляем к тексту элементы массива
    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder out= new StringBuilder(string);
        for (String st:strings ) {
            out.append(st);
        }
        return out;
    }
    //замена текста в строке в заданном диапазоне
    public static StringBuilder replace(String string, String str, int start, int end) {
        return new StringBuilder(string).replace(start,end,str);
    }
}


/*
Метод
-StringBuilder append(obj)  -Преобразовывает переданный объект в строку и добавляет к текущей строке
-StringBuilder insert(int index, obj)  -Преобразовывает переданный объект в строку и вставляет в текущую строку
-StringBuilder replace(int start, int end, String str)  -Заменяет часть строки, заданную интервалом start..end на переданную строку
-StringBuilder deleteCharAt(int index)  -Удаляет из строки символ под номером index
-StringBuilder delete(int start, int end)  -Удаляет из строки символы, заданные интервалом
-int indexOf(String str, int index)  -Ищет подстроку в текущей строке
-int lastIndexOf(String str, int index)  -Ищет подстроку в текущей строке с конца
-char charAt(int index)  -Возвращает символ строки по его индексу
-String substring(int start, int end)  -Возвращает подстроку, заданную интервалом
-StringBuilder reverse()  -Разворачивает строку задом наперед.
-void setCharAt(int index, char)  -Изменяет символ строки, заданный индексом на переданный
-int length()  -Возвращает длину строки в символах
 */