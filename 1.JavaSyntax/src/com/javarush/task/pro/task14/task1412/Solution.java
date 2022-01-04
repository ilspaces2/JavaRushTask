package com.javarush.task.pro.task14.task1412;

/* 
Группировка исключений
*/

public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (InterruptedException | IllegalStateException e) {
            System.out.println("Произошло исключение на букву I");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
        }
    }
}