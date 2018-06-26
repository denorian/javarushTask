package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(bufferedReader.readLine()));
            int countWorld = 0;

            while (bufferedReader1.ready()) {
                String[] splittedString = bufferedReader1.readLine().trim().split("[\\s,.!]+");
                for (String tmp: splittedString) {
                    if (tmp.equals("world")) countWorld++;
                }
            }
            System.out.println(countWorld);
            bufferedReader.close();
            bufferedReader1.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
