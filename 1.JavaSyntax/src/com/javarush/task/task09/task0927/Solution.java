package com.javarush.task.task09.task0927;

import java.util.*;

/*
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> hmap = new HashMap<String, Cat>();
        hmap.put("1", new Cat("1"));
        hmap.put("2", new Cat("2"));
        hmap.put("3", new Cat("3"));
        hmap.put("4", new Cat("4"));
        hmap.put("5", new Cat("5"));
        hmap.put("6", new Cat("6"));
        hmap.put("7", new Cat("7"));
        hmap.put("8", new Cat("8"));
        hmap.put("9", new Cat("9"));
        hmap.put("10", new Cat("10"));
        return hmap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> targetSet = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            targetSet.add(pair.getValue());
        }
        return targetSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
