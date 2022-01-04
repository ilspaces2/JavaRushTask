package com.javarush.task.pro.task09.task0907;

import java.util.Objects;
import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        System.out.println("Десятичное число " + 1256 + " равно шестнадцатеричному числу " + toHex(1256));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
//        System.out.println(toHexTwo(1256));
    }

    //свое замороченное решение
    public static String toHexTwo(int decimalNumber) {
        String hex = "";
        if (decimalNumber <= 0) return hex;
        String bin = "";
        String[] bin2 = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        //decimalToBinary
        while (decimalNumber != 0) {
            bin = decimalNumber % 2 + bin;
            decimalNumber = decimalNumber / 2;
        }
        //делаем бинарное число кратным 4
        while (bin.length() % 4 != 0) {
            bin = 0 + bin;
        }
        //сравниваем массив bin2 c подстрокой bin, если совпадает то из переменной HEX берем значение и плюсуем его к переменной hex
        //по окончанию возвращаем готовый hex
        for (int i = 0; i < bin.length(); i += 4) {
            for (int j = 0; j < bin2.length; j++) {
                if (bin2[j].equals(bin.substring(i, i + 4))) {
                    hex = hex + HEX.charAt(j);
                }
            }
        }
        return hex;
    }

    public static String toHex(int decimalNumber) {
        String hex ="";
        if(decimalNumber<=0) return hex;
        while (decimalNumber!=0){
            hex = HEX.charAt(decimalNumber%16)+hex;
            decimalNumber=decimalNumber/16;
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber==null)return 0;
            int dec =0;
        for (int i = 0; i <hexNumber.length() ; i++) {
            dec= 16* dec+HEX.indexOf(hexNumber.charAt(i));

        }
        return dec;
    }
}
