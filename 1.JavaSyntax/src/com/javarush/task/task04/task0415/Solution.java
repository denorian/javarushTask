package com.javarush.task.task04.task0415;

/* 
Правило треугольника
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

        if(a<(b+c) && b<(a+c) && c<(a+b)){
            System.out.print("Треугольник существует.");
        }else {
            System.out.print("Треугольник не существует.");
        }
    }
}