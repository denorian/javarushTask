package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list3 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> list0 = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            list.add(scanner.nextInt());
        }


        for (Integer integer : list) {
            if(integer%3 == 0 && integer%2 == 0){
                list3.add(integer);
                list2.add(integer);
            }else if(integer%3 == 0){
                list3.add(integer);
            }else if(integer%2 == 0){
                list2.add(integer);
            }else{
                list0.add(integer);
            }
        }

        printList(list3);
        printList(list2);
        printList(list0);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
