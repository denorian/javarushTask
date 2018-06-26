package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String link = reader.readLine();
            FileInputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(link);
            }catch (FileNotFoundException exception){
                System.out.println(link);
                break;
            }
            fileInputStream.close();
        }
    }
}
