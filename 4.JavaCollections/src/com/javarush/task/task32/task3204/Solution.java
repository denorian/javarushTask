package com.javarush.task.task32.task3204;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        String laters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "1234567890";

        ArrayList<String> password = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            password.add(String.valueOf(laters.charAt((int)(Math.random()*26))));
        }
        for (int i = 0; i < 2; i++) {
            password.add(String.valueOf(laters.toUpperCase().charAt((int)(Math.random()*26))));
        }
        for (int i = 0; i < 2; i++) {
            password.add(String.valueOf(digits.charAt((int)(Math.random()*10))));
        }

        Collections.shuffle(password);

        try {
            output.write(String.join("", password).getBytes());
        }catch (Exception e){}

        return output;
    }
}