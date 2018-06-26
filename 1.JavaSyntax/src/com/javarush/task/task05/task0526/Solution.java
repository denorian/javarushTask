package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman woman = new Woman("Vikki", 25, "Hydro");
        Man man = new Man("Alex", 28, "ZIP");
        System.out.println(woman);
        System.out.println(man);
        Woman woman2 = new Woman("Vikki2", 25, "Hydro2");
        Man man2 = new Man("Alex2", 28, "ZIP2");
        System.out.println(woman2);
        System.out.println(man2);
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    //напишите тут ваш код
}
