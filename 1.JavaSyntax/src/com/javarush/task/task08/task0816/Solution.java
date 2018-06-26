package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 9 1980"));
        map.put("Stallone3", new Date("APRIL 3 1980"));
        map.put("Stallone4", new Date("MAY 1 1980"));
        map.put("Stallone5", new Date("OCTOBER 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));
        map.put("Stallone10", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator <Map.Entry<String,Date>> inter = map.entrySet().iterator();
        while(inter.hasNext()) {
            int month = inter.next().getValue().getMonth();
            if(month > 4 && month < 8)
                inter.remove();
        }

    }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
