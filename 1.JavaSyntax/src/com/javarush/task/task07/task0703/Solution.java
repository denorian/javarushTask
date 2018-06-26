package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] arrayS = new int[10];
        int[] arrayI = new int[10];
        for (int i = 0; i < 10 ; i++) {
            arrayS[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            arrayI[9 - i] = arrayS[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayI[i]);
        }
    }
}
