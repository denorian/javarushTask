package com.javarush.task.task07.task0712;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        int sizemin = 9999;
        int sizemax = -9999;
        for (String o : list) {
            if(sizemax < o.length()){
                sizemax = o.length();
            }
            if(sizemin > o.length()){
                sizemin = o.length();
            }
        }


        for (String o : list) {
            if(sizemin == o.length()){
                System.out.println(o);
                break;
            }else if(sizemax == o.length()){
                System.out.println(o);
                break;
            }
        }
    }
}
