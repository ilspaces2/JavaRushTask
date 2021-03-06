package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

//    static {
//        runtimeStorage.put("password", "root");
//        runtimeStorage.put("login", "user");
//    }

    public static void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        for (Map.Entry<String, String> prop : runtimeStorage.entrySet()) {
            properties.setProperty(prop.getKey(), prop.getValue());
        }
        properties.store(outputStream, null);
//        runtimeStorage.clear();
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry<Object, Object> prop : properties.entrySet()) {
            runtimeStorage.put(prop.getKey().toString(), prop.getValue().toString());
        }

    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
//            FileOutputStream fileOutputStream =new FileOutputStream(reader.readLine());
//            save(fileOutputStream);
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
