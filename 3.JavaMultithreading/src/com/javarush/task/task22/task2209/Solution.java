package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        ArrayList<String> list = new ArrayList<>();
        while (fileReader.ready()) {
            String[] s = fileReader.readLine().split("\\s");
            Collections.addAll(list, s);
        }
        fileReader.close();
        reader.close();

        String[] words = new String[list.size()];
        words = list.toArray(words);

        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, words);
        StringBuilder sb = new StringBuilder();

        if (list.size() == 0) return new StringBuilder();

        sb.append(list.get(0));
        list.remove(0);

        while (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                String a = list.get(i).toUpperCase().toLowerCase();
                String b = sb.toString().toUpperCase().toLowerCase();
                if (a.charAt(0) == b.charAt(sb.length() - 1)) {
                    sb.append(" ").append(list.get(i));
                    list.remove(i);
                    continue;
                }
                if (b.charAt(0) == a.charAt(a.length() - 1)) {
                    sb.insert(0, " ");
                    sb.insert(0, list.get(i));
                    list.remove(i);
                }
            }
        }
        return sb;
    }
}
