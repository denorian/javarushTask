package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Brovko","Alex");
        map.put("Бровко","Михаил");
        map.put("Бровко","Светлана");
        map.put("Бровко","Сергей");
        map.put("Vagner","Kurt");
        map.put("Tanger","Kurt");
        map.put("Lao","Lee");
        map.put("Lee","Jonh");
        map.put("Lee","Decard");
        map.put("Brandon","Decard");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
