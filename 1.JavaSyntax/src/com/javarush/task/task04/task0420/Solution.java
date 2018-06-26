package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if(a <= b && b <= c)
            System.out.println(c + " " + b + " " + a);
        else if(c <= a && a <= b)
            System.out.println(b + " " + a + " " + c);
        else if(b <= c && c <= a)
            System.out.println(a + " " + c + " " + b);
        else if(a <= c && c <= b)
            System.out.println(b + " " + c + " " + a);
        else if(b <= a && a <= c)
            System.out.println(c + " " + a + " " + b);
        else if(c <= b && b <= a)
            System.out.println(a + " " + b + " " + c);
    }
}
