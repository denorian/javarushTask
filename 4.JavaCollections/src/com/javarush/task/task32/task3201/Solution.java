package com.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {

        String fileName = args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];

        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
        long position = randomAccessFile.length();
        if(position < number){
            number = position;
        }
        randomAccessFile.seek(number);
        randomAccessFile.write(text.getBytes());
        randomAccessFile.close();
    }
}
