package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year%4==0 && year%100 !=0 || year%400==0)
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");


    }
}