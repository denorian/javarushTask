package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,String> map = new HashMap<>();

        int count = 0;
        try {
            while (true){
                count++;
                int id = Integer.parseInt(reader.readLine());
                if(!(id > 0))
                    break;

                String name = reader.readLine();
                if(name.length()==0)
                    break;

                map.put(count,id+" "+name);
            }
        }catch (Exception e){

        }


        for(Map.Entry<Integer,String> pair: map.entrySet()){
            System.out.println(pair.getValue());
        }


    }
}
