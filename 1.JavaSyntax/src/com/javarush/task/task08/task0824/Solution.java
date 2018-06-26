package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human ("Redka",false,2);
        Human child2 = new Human ("Morkovka",true,3);
        Human child3 = new Human ("Repka",false,4);

        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human mother = new Human ("Elka",false,20, children);
        Human father = new Human ("Hren",true,30, children);

        ArrayList<Human> parent1 = new ArrayList<>();
        parent1.add(mother);
        ArrayList<Human> parent2 = new ArrayList<>();
        parent2.add(father);

        Human grandfather1 = new Human ("Bob",true,70,parent1);
        Human grandfather2 = new Human ("Bobik",true,80,parent1);
        Human grandmother1 = new Human ("Alisa",false,60,parent2);
        Human grandmother2 = new Human ("Sharik",false,50,parent2);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }

    public static class Human {
        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
