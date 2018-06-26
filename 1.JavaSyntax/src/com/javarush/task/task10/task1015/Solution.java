package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList<>();
        list[0].add("Ska");
        list[0].add("Sk1a");
        list[0].add("Sk2a");
        list[1] = new ArrayList<>();
        list[1].add("Ska");
        list[1].add("Sk1a");
        list[1].add("Sk2a");
        list[2] = new ArrayList<>();
        list[2].add("Ska");
        list[2].add("Sk1a");
        list[2].add("Sk2a");

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}