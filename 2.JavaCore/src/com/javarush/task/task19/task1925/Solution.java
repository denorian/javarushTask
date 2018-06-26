package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader filereader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter filewriter = new BufferedWriter(new FileWriter(args[0]));
        StringBuffer outText = new StringBuffer("");

        while (filereader.ready()){
            String line = filereader.readLine();
            String[] words = line.split(" ");

            for (String word : words) {
                if(word.length() > 6)
                    outText.append(word).append(",");
            }
        }

        outText.delete(outText.length()-1,outText.length());
        filewriter.write(outText.toString());

        filereader.close();
        filewriter.close();
    }
}
