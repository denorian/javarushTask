package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Scanner;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int maximum = -99999;
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        while (count>0){
            int num = scanner.nextInt();
            if (maximum < num)
                maximum = num;
            count--;
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
