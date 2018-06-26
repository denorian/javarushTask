package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.*;

public class Solution {
    static TreeMap<String, Double> map = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        String filename = args[0];

        BufferedReader file = new BufferedReader(new FileReader(filename));

        while (file.ready()) {
            String s = file.readLine();
            String[] strs = s.split(" ");
            addMap(strs[0], Double.parseDouble(strs[1]));
        }

        file.close();

        TreeMap<String, Double> treeMap = new TreeMap<String, Double>(map);

        for (Map.Entry<String, Double> znach : treeMap.entrySet()){
            System.out.println(znach.getKey()+" "+znach.getValue());
        }
    }

    private static void addMap(String name, Double value) {
        if (!map.containsKey(name))
            map.put(name,value);
        else
            map.put(name, map.get(name) + value);
    }
}
