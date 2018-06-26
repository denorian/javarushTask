package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int countPlus = 0;
        int countMinus = 0;
        if (a>0)
            countPlus++;
        if (b>0)
            countPlus++;
        if (c>0)
            countPlus++;
        if (a<0)
            countMinus++;
        if (b<0)
            countMinus++;
        if (c<0)
            countMinus++;

        System.out.println("количество отрицательных чисел: " + countMinus);
        System.out.println("количество положительных чисел: " + countPlus);
    }
}
