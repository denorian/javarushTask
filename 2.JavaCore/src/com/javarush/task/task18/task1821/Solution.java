package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        Map<Character,Integer> map = new TreeMap<>();
        Character charer;
        int temp;
        while (fileInputStream.available() > 0) {
            System.out.println();

            charer = (char) fileInputStream.read();

            if(map.get(charer) != null){
                temp = map.get(charer)+1;
                map.put(charer, temp);
            }else{
                map.put(charer, 1);
            }
        }

        for(Map.Entry<Character,Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }


        fileInputStream.close();
    }
}
