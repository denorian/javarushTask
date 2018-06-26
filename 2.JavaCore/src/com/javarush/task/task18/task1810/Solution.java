package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;
        while (true) //пока есть еще непрочитанные байты
        {
            inputStream = new FileInputStream( reader.readLine());
            if(inputStream.available() < 1000){
                inputStream.close();
                throw new DownloadException();
            }
            inputStream.close();
        }

    }

    public static class DownloadException extends Exception {

    }
}
