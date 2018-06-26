package com.javarush.task.task07.task0709;


import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
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
