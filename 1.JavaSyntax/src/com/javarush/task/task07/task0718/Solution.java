package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {
            list.add(scanner.nextLine());
        }

        int count = 0;
        for (String s : list) {
            if(count < s.length())
                count = s.length();
            else {
                System.out.println(list.indexOf(s));
                break;
            }

        }
    }
}

