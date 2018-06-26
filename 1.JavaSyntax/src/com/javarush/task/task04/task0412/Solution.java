package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a == 0)
            System.out.println(a);
        if(a > 0)
            System.out.println(a*2);
        if(a < 0)
            System.out.println(a+1);
    }

}