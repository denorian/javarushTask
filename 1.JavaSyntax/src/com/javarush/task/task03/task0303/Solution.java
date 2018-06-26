package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(60, 70));
        System.out.println(convertEurToUsd(1000, 71));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return (double) eur * course;
    }
}
