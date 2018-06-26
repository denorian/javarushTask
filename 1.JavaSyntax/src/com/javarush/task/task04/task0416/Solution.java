package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();
        if(time > 5)
            time = time % 5;

        if (time < 3 || time ==5)
            System.out.println("зелёный");
        if (time >= 3 && time < 4)
            System.out.println("желтый");
        if (time >= 4 && time < 5)
            System.out.println("красный");

    }
}