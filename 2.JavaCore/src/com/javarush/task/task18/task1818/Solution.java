package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(file1);
        FileInputStream inputStream1 = new FileInputStream(file2);
        FileInputStream inputStream2 = new FileInputStream(file3);

        byte[] buffer = new byte[inputStream1.available()];
        int count1;
        while (inputStream1.available() > 0)
        {
            count1 = inputStream1.read(buffer);
            outputStream.write(buffer, 0, count1);
        }

        buffer = new byte[inputStream2.available()];
        while (inputStream2.available() > 0)
        {
            int count2 = inputStream2.read(buffer);
            outputStream.write(buffer, 0, count2);
        }

        outputStream.close();
        inputStream1.close();
        inputStream2.close();
    }
}
