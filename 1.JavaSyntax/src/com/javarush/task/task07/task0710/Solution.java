package com.javarush.task.task07.task0710;

import java.util.ArrayList;
import java.util.Scanner;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            list.add(0, scanner.nextLine());
        }

        for (String o : list) {
            System.out.println(o);
        }
    }
}
