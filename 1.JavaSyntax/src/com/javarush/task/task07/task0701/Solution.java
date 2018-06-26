package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[20];
        for (int i = 0; i < 20; i++) {
            arrays[i] = scanner.nextInt();
        }
        return arrays;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = -9999;

        for (int i : array) {
            if(i > max)
                max = i;
        }
        return max;
    }
}
