package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }

        int count = 1;
        int maximum = 1;
        int previous = -99999999;

        for (Integer integer : list) {
            if (previous == integer){
                count++;
                if(count > maximum){
                    maximum = count;

                }
            }else{
                previous = integer;
                count = 1;
            }
        }

        System.out.println(maximum);
    }
}