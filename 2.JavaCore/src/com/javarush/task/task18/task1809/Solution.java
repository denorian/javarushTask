package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        byte[] buffer = new byte[inputStream.available()];
        int count = inputStream.read(buffer);

        for (int i = 0; i < buffer.length / 2; i++) {
            byte tmp = buffer[i];
            buffer[i] = buffer[buffer.length - 1 - i];
            buffer[buffer.length - 1 - i] = tmp;
        }
        outputStream1.write(buffer,0,count);
        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream1.close();
        reader.close();
    }
}
