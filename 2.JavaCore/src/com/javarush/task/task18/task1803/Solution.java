package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());


        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if(map.containsKey(data)){
                max = map.get(data)+1;
                map.put(data,map.get(data)+1);
            } else {
                map.put(data,1);
            }
        }

        for(Map.Entry<Integer,Integer> pair : map.entrySet())
        {
            if(pair.getValue() == max){
                System.out.print(pair.getKey() + " ");

            }
        }

        fileInputStream.close();
        reader.close();
    }
}
