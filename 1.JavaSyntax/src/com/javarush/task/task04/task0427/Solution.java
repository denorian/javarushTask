package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();

        if(a > 0 && a < 1000){
            if(a < 10 && a%2 == 0)
                System.out.println("четное однозначное число");
            else if(a < 10 && a%2 != 0)
                System.out.println("нечетное однозначное число");
            else if(a < 100 && a%2 == 0)
                System.out.println("четное двузначное число");
            else if(a < 100 && a%2 != 0)
                System.out.println("нечетное двузначное число");
            else if(a > 99 && a%2 == 0)
                System.out.println("четное трехзначное число");
            else if(a > 99 && a%2 != 0)
                System.out.println("нечетное трехзначное число");
        }

    }
}


