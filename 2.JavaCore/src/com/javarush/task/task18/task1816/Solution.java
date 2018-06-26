package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);

        int counter = 0;

        while (inputStream.available() > 0) {
            int tmpByte = inputStream.read();

            if ((tmpByte >= 65 && tmpByte <= 90) || (tmpByte >= 97 && tmpByte <= 122)) counter++;

        }
        inputStream.close();
        System.out.println(counter);
    }
}
