package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        for (int i = 0; i < 5; i++){
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < a.length; i++){
            int min = a[i];
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < min){
                    min = a[j];
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            System.out.println(a[i]);
        }
    }
}
