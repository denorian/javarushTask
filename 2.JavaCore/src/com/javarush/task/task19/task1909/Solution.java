package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = reader.readLine();
        String fName2 = reader.readLine();
        reader.close();
        BufferedReader freader = new BufferedReader(new FileReader(fName1));
        BufferedWriter fwriter = new BufferedWriter(new FileWriter(fName2));
        StringBuilder sb = new StringBuilder();
        while (freader.ready()) {
            sb.append((char)freader.read());
        }
        fwriter.write(sb.toString().replaceAll("\\.","!"));
        freader.close();
        fwriter.close();
    }
}
