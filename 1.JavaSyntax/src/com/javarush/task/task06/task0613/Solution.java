package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        //создай 10 котов
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        System.out.println(Cat.catCount);

        //выведи значение переменной catCount
    }

    public static class Cat {
        //создай статическую переменную catCount
        public static int catCount;
        //создай конструктор

        public Cat() {
            catCount++;
        }
    }
}
