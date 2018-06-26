package com.javarush.task.task09.task0921;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true){
                Scanner scanner = new Scanner(System.in);
                list.add(scanner.nextInt());
            }
        }catch (Exception e){
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }
}
