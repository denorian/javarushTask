package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader filereader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (filereader.ready()){
            String line = filereader.readLine();
            System.out.println(new StringBuilder(line).reverse().toString());
        }

        filereader.close();
    }
}
