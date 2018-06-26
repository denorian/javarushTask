package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList cats = new ArrayList<Cat>();

    public Cat() {
        Cat.cats.add(this);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
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
        Cat.cats.add(cat1);
        Cat.cats.add(cat2);
        Cat.cats.add(cat3);
        Cat.cats.add(cat4);
        Cat.cats.add(cat5);
        Cat.cats.add(cat6);
        Cat.cats.add(cat7);
        Cat.cats.add(cat8);
        Cat.cats.add(cat9);
        Cat.cats.add(cat10);

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Object cat : cats) {
            System.out.println(cat);
        }
    }
}
