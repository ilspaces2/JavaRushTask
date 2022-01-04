package com.javarush.task.task3101.task3101;

import java.security.MessageDigest;

public class T {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("Hello, JM.".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}