package com.javarush.task.pro.task15.task1523;

import javax.imageio.IIOException;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args)  {



        try

            {
            URL url = new URL("http://httpbin.org/post");
            URLConnection urlConnection = url.openConnection();
                urlConnection.setDoOutput(true);
                urlConnection.getOutputStream();


            BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            while (bufferedReader.ready()) System.out.println(bufferedReader.readLine());
        }catch (IOException err){
            err.printStackTrace();
        }



    }
}

