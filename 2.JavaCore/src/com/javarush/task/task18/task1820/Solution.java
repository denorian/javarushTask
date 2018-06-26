package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(file2);
        FileInputStream fileInputStream = new FileInputStream(file1);

        byte[] buffer = new byte[fileInputStream.available()];

        String file = "";
        while (fileInputStream.available() > 0) {
            file += Character.toString((char) fileInputStream.read());
        }

        String[] arr = file.split(" ");

        for (String s : arr) {
            float flNum = Float.parseFloat(s);
            System.out.println(Math.round(flNum));
            outputStream.write((Math.round(flNum) + " ").getBytes());
        }

        outputStream.close();
        fileInputStream.close();
    }
}
