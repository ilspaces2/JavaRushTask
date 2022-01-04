package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/*
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

  public static int toOctal(int decimalNumber) {
        if (decimalNumber<=0) return 0;

        int oct = 0;
        int dec =decimalNumber;

        int i =0;
        while (dec!=0){
            oct=oct+dec%8* (int) Math.pow(10,i);
            dec= dec/8;
            i++;

        }
        return oct;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber<=0) return 0;

        int dec = 0;
        int oct =octalNumber;

        int i =0;
        while (oct!=0){
            dec=dec+oct%10* (int) Math.pow(8,i);
            oct= oct/10;
            i++;

        }
        return dec;
    }
}