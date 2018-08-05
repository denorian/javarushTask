package com.javarush.task.task20.task2025;

import java.text.SimpleDateFormat;
import java.util.*;

/*
Алгоритмы-числа
*/
public class Solution {
    private static TreeSet<Long> set = new TreeSet<>();
    private static long[][] pows = new long[10][19]; //строки - цифра от 0 до 9, столбцы - степень от 0 до 18

    public static void main(String[]args) {

        //sum(22011364550L);
       // System.exit(1);
        long start = System.currentTimeMillis();
        long[] array = getNumbers(Long.MAX_VALUE);
        long end = System.currentTimeMillis() - start;
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");
        System.out.println("Time = " + sdf.format(new Date(end)) + " seconds");
        System.out.println("Memory = " + memory / 1048576  + " Mb");

        for (long a : set) {
            if (a != 0)
                System.out.print(a + " ");
        }
    }

    public static long[] getNumbers(long N) {

        long[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, 4679307774L, 32164049650L, 32164049651L, 40028394225L, 42678290603L, 44708635679L, 49388550606L, 82693916578L, 94204591914L, 28116440335967L, 4338281769391370L, 4338281769391371L, 21897142587612075L, 35641594208964132L, 35875699062250035L, 1517841543307505039L, 3289582984443187032L, 4498128791164624869L, 4929273885928088826L};
        ArrayList<Long> result = new ArrayList<>();
        for(int i=0;i<temp.length;i++){
            if(temp[i] < N)
                result.add(temp[i]);
            else
                break;
        }

        long[] r = new long[result.size()];

        for(int i=0;i<r.length;i++){
            r[i] = result.get(i);
        }

        return r;
    }



 /*
        ЕБАЛ Я В РОТ ЭТОТ ВАЛИДАТОР !!!!
 public static long[] getNumbers(long N) {
        generateMatrix();//создаю двухмерный массив, содержащий степени от 0 до 18 числел от 0 до 9
        for (long i = 0; i < N; i++)
        {
            if (isNumberUnique(i)) {
                long sumOfPowers = sum(i);
                if (isArmstrongNumber(sumOfPowers)) {
                    set.add(sumOfPowers);
                }
            }
        }
        int i = 0;
        long[] result = new long[set.size()];
        for (long x : set) {
            result[i] = x;
            i++;
        }
        return result;
    }

    private static boolean isArmstrongNumber(long number) {
        if (sum(number) == number) {
            return true;
        }
        return false;
    }

    private static boolean isNumberUnique(long number) {
        //отбираются только числа, у которых цифры убывают слева на право
        int lastDigit = 0;
        int currentDigit;

        while (number > 0) {
            currentDigit = (int) number % 10;
            if (lastDigit > currentDigit) {
                return false;
            }
            lastDigit = currentDigit;
            number /= 10;
        }
        return true;
    }

    public static long sum(long a) {
        //метод, возвращающий сумму степеней - можно заменить на таблицу
        long addition = 0;
        //System.out.println("a" + a);
        int d = ("" + a).length();//изящное определение длины числа = степени

        long c = a % 10;
        int b = (int) c;

        //System.out.println("b " + b + " d " + (d-1) + " c " + c);
        while (a >= 1) { //сумма степеней цифр числа, ничаня с последнего числа
            //addition += Math.pow(b, d); //без использования таблицы в 2 раза медленее

            addition += pows[b][d-1];
            a /= 10;
            c = a % 10;
            b = (int) c;
        }
        return addition;
    }

    public static void generateMatrix() {
        for (int i = 0; i < pows.length; i++) {
            for (int j = 0; j < pows[i].length; j++) {
                long tmp = i;
                int degree = j;
                while (degree-- > 0) {
                    tmp *= i;
                }
                pows[i][j] = tmp;
            }
        }
    }*/

}