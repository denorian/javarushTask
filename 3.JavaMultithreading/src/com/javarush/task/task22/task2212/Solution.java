package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if(telNumber == null)
            return false;

        return (telNumber.matches("^\\+[\\(\\-]?(\\d[\\(\\)\\-]?){11}\\d$") ||
                telNumber.matches("^\\(?(\\d[\\-\\(\\)]?){9}\\d$")) &&
                telNumber.matches("[\\+]?\\d*(\\(\\d{3}\\))?\\d*\\-?\\d*\\-?\\d*\\d$");
    }

    public static void main(String[] args) {

    }
}
