package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/* 
Использование TreeSet
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<Character> characters = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while (reader.ready()){
                String str = reader.
                        readLine().
                        toLowerCase().
                        replaceAll("[^\\p{Alpha}]","");
                for (int i = 0; i < str.length(); i++)
                    characters.add(str.charAt(i));
            }
        }

        int charactersSize = characters.size() > 5 ? 5 : characters.size();
        Iterator<Character> iterator = characters.iterator();

        for (int i = 0; i < charactersSize; i++) {
            System.out.print(iterator.next());
        }
    }
}
