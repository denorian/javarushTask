package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filename1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename2));

        while (bufferedReader1.ready()){
            String k = bufferedReader1.readLine();
            String[] kmas = k.split("[\\p{P} \\t\\n\\r]");
            for (String mm : kmas) {
                bufferedWriter.write(mm);
            }
        }

        bufferedReader1.close();
        bufferedWriter.close();
    }
}
