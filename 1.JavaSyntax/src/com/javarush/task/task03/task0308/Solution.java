package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(factorial(10));
    }

    public static int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}
