package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        byte[][] b = a.clone();
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].clone();
        }

        int rectCount = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i][j] == 1) {
                    rectCount++;
                    for (int k = i; k < b.length; k++) {
                        if (b[k][j] == 0) break;
                        for (int l = j; l < b.length; l++) {
                            if (b[k][l] == 1) b[k][l] = 0;
                            else break;
                        }
                    }
                }
            }
            System.out.println();
        }
        return rectCount;
    }
}
