package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String your_file_name = "D:\\downloads\\YandexDisk\\prog\\java\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2014\\1";
        OutputStream outputStream = new FileOutputStream(your_file_name);
        InputStream inputStream = new FileInputStream(your_file_name);

        Solution savedObject = new Solution(4);
        savedObject.save(outputStream);
        outputStream.flush();
        outputStream.close();
        System.out.println(savedObject.string);

        Solution loadedObject = new Solution(6);
        loadedObject.load(inputStream);
        inputStream.close();
        System.out.println(loadedObject.string);
        System.out.println(loadedObject.string.equals(savedObject.string));


    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
     String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }


    public void save(OutputStream out) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(string);
        objectOutputStream.close();
    }

    public void load(InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(in);
        string = (String) objectInputStream.readObject();
        objectInputStream.close();
    }

}
