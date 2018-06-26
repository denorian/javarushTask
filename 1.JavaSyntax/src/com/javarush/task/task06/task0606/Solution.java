package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while(true){
            if((num%10)%2 == 0)
                even++;
            else
                odd++;

            if (num < 10) {
                break;
            }
            num = num/10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
