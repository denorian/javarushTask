package com.javarush.task.task05.task0529;

import java.util.Scanner;

/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            String word = scanner.nextLine();
            if(word.equals("сумма")){
                break;
            }
            sum += Integer.parseInt(word);
        }
        System.out.println(sum);
    }
}
