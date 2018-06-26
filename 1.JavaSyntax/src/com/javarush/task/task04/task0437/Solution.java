package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; ++i){
            Str(i);
            System.out.println("8");
        }
    }

    public static void Str(int n){
        for (int i = 1; i < n; ++i){
            System.out.print("8");
        }

    }
}
