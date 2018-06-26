package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (true){
            num = scanner.nextInt();
            sum += num;

            if (num == -1)
                break;
        }
        System.out.println(sum);
    }
}
