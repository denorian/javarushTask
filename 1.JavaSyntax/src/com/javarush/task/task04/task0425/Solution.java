package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a>0 && b>0)
            System.out.println(1);
        if(a<0 && b>0)
            System.out.println(2);
        if(a<0 && b<0)
            System.out.println(3);
        if(a>0 && b<0)
            System.out.println(4);
    }
}
