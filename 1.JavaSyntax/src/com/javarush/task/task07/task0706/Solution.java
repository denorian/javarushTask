package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[15];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < 15 ; i++) {
            array1[i] = scanner.nextInt();
            if(i == 0){
                sumEven = array1[i];
            }else if(i%2 == 0){
                sumEven += array1[i];
            }else {
                sumOdd += array1[i];
            }
        }

        if(sumEven>sumOdd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
