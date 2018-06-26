package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();
        br.close();
        FileInputStream fis2 = new FileInputStream(f2);
        FileInputStream fis1 = new FileInputStream(f1);
        ArrayList<Integer> list = new ArrayList<>();

        while (fis2.available() > 0)
        {
            list.add(fis2.read());
        }

        while (fis1.available() > 0)
        {
            list.add(fis1.read());
        }

        FileOutputStream fos = new FileOutputStream(f1);

        for (int x : list)
        {
            fos.write(x);
        }

        fis1.close();
        fis2.close();
        fos.close();
    }
}