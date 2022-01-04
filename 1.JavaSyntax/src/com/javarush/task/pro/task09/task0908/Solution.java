package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static final String[] BIN = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    public static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {


        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {

        String out = "";
        if (binaryNumber == null) return out;

        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = 0 + binaryNumber;
        }

        for (int i = 0; i < binaryNumber.length(); i += 4) {
            for (int j = 0; j < BIN.length; j++) {
                if (BIN[j].equals(binaryNumber.substring(i, i + 4))) {
                    out = out + HEX.charAt(j);
                }
            }
        }
        return out;
    }

    public static String toBinary(String hexNumber) {
        String out = "";
        if (hexNumber == null) return out;

        for (int i = 0; i <hexNumber.length() ; i++) {

            for (int j = 0; j <HEX.length() ; j++) {
                if (HEX.charAt(j)==(hexNumber.charAt(i))){
                    out =out+BIN[j];
                }
            }
        }

        return out;
    }
}
