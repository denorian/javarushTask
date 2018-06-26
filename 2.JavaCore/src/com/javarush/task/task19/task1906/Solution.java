package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader readerFile = new FileReader(reader.readLine());
        FileWriter writer = new FileWriter(reader.readLine());
        reader.close();

        int count = 0;
        while (readerFile.ready())
        {
            count++;
            int data = readerFile.read();
            if(count%2 == 0)
                writer.write(data);
        }

        readerFile.close();
        writer.close();
    }
}
