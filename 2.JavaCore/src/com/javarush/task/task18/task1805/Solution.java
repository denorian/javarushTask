package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());


        SortedSet<Integer> setNumbers = new TreeSet<>();
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if(!setNumbers.contains(data)){
                setNumbers.add(data);
            }
        }

        for (Integer setNumber : setNumbers) {
            System.out.print(setNumber + " ");
        }
        fileInputStream.close();
        reader.close();
    }
}
