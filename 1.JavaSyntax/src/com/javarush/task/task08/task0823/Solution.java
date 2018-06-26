package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();
        String s = "";

        for (int i = 0; i < temp.length(); i++) {
            if (i == 0 || temp.charAt(i - 1) == ' '){
                s = s + temp.toUpperCase().charAt(i);
            }else
                s = s + temp.charAt(i);
        }

        System.out.println(s);
    }
}
