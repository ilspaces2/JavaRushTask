package com.javarush.task.task20.task2003;


import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        int count1 = 0;
        int count2 = 0;
        int winner = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\downloads\\YandexDisk\\prog\\java\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2003\\input.txt"));

        String[] p_q = bufferedReader.readLine().split(" ");
        int p = Integer.parseInt(p_q[0]);
        int q = Integer.parseInt(p_q[1]);


        int[][] arr1 = new int[8][2];
        int[][] arr2 = new int[8][2];
        for (int i = 0; i < arr1.length*2; i++) {
            if (i <=7) {
                String[] coords1 = bufferedReader.readLine().split(" ");
                arr1[i][0] = Integer.parseInt(coords1[0]);
                arr1[i][1] = Integer.parseInt(coords1[1]);
            }
            if (i > 7) {
                String[] coords2 = bufferedReader.readLine().split(" ");
                arr2[i - 8][0] = Integer.parseInt(coords2[0]);
                arr2[i - 8][1] = Integer.parseInt(coords2[1]);
            }
        }
        bufferedReader.close();

        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i][0] > q || arr1[i][0] < -q) && (arr1[i][1] > q || arr1[i][1] < -q)) continue;

            if ((arr1[i][0] == p || arr1[i][0] == -p || arr1[i][0] == 0 || arr1[i][0] == p * 2 || arr1[i][0] == -p * 2) &&
                    (arr1[i][1] == p || arr1[i][1] == -p || arr1[i][1] == 0 || arr1[i][1] == p * 2 || arr1[i][1] == -p * 2)) {
                count1++;
            }

            if ((arr2[i][1] == p || arr2[i][1] == -p || arr2[i][1] == 0 || arr2[i][1] == p * 2 || arr2[i][1] == -p * 2) &&
                    (arr2[i][1] == p || arr2[i][1] == -p || arr2[i][1] == 0 || arr2[i][1] == p * 2 || arr2[i][1] == -p * 2)) {
                count2++;
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\downloads\\YandexDisk\\prog\\java\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2003\\output.txt"));
        if (count1 > count2) {
            bufferedWriter.write(String.valueOf(winner = 1));
            bufferedWriter.write("\n");
            bufferedWriter.write(String.valueOf(count1));
            bufferedWriter.close();
        }
        if (count1 < count2) {
            bufferedWriter.write(String.valueOf(winner = 2));
            bufferedWriter.write("\n");
            bufferedWriter.write(String.valueOf(count2));
            bufferedWriter.close();
        }
        if (count1 == count2) {
            bufferedWriter.write("0");
            bufferedWriter.write("\n");
            bufferedWriter.write("0");
            bufferedWriter.close();
        }
    }
}








