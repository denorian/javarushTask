package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dates = new Date(date);
        long finish = dates.getTime();
        dates.setDate(1);
        dates.setMonth(0);
        long start = dates.getTime();
        long dif = finish - start;
        long msDay = 1000 * 60 *60 *24;
        int dayCount = (int)(dif / msDay);
        if(dayCount % 2 == 0) return true;
        else return false;
    }
}
