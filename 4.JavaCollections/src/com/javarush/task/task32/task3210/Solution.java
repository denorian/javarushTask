package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw")) {
            byte[] buf = new byte[text.length()];
            randomAccessFile.seek(number);
            randomAccessFile.read(buf, 0, buf.length);
            String storeToFile = new String(buf).equals(text) ? "true" : "false";
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(storeToFile.getBytes());
        }
    }
}
