package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        if(word1.equals(word2))
            System.out.println("Имена идентичны");
        else if(word1.length() == word2.length())
            System.out.println("Длины имен равны");
    }
}
