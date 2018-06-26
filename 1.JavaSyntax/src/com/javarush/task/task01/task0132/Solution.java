package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int first = number/100;
        int second = number/10 - first*10;
        int third = number - second*10 - first*100;
        return (first+second+third);
    }
}