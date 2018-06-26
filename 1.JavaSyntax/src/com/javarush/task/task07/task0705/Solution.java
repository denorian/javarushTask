package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[20];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        for (int i = 0; i < 20 ; i++) {
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            array2[i] = array1[i];
            array3[i] = array1[i+10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array3[i]);
        }
    }
}
