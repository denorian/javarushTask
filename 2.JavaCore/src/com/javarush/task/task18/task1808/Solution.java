package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);

        byte[] buffer = new byte[1];
        int counter = inputStream.available()/2;

        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int count = inputStream.read(buffer);
            if(inputStream.available() >= counter)
            {
                outputStream1.write(buffer, 0, count);
            }else {
                outputStream2.write(buffer, 0, count);
            }
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream1.close();
        outputStream2.close();
    }
}
