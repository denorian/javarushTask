package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();

        if(a == 0)
            System.out.println("ноль");
        if(a < 0 && a%2 == 0)
            System.out.println("отрицательное четное число");
        if(a < 0 && a%2 != 0)
            System.out.println("отрицательное нечетное число");
        if(a > 0 && a%2 == 0)
            System.out.println("положительное четное число");
        if(a > 0 && a%2 != 0)
            System.out.println("положительное нечетное число");

    }
}
