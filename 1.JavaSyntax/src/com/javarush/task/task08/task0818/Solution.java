package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Vasa", 500);
        map.put("Vasa2", 1500);
        map.put("Vasa3", 4500);
        map.put("Vasa53", 100);
        map.put("Vas3", 1100);
        map.put("Vasa5", 500);
        map.put("Vasa6", 1500);
        map.put("Vasa7", 4500);
        map.put("Vasa83", 100);
        map.put("Vas9", 1100);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            if (iter.next().getValue() < 500) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}