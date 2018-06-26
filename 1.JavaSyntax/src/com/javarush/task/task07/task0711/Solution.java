package com.javarush.task.task07.task0711;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        int size = 9999;
        for (String o : list) {
            if(size > o.length()){
                size = o.length();
            }
        }

        for (String o : list) {
            if(size == o.length()){
                System.out.println(o);
            }
        }
    }
}
