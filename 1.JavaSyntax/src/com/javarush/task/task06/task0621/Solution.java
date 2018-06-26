package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String Name = reader.readLine();
        Cat catGrandFather = new Cat(Name);
        Name = reader.readLine();
        Cat catGrandMother = new Cat(Name);
        Name = reader.readLine();
        Cat catFather = new Cat(Name,catGrandFather,null);
        Name = reader.readLine();
        Cat catMother = new Cat(Name,null,catGrandMother);
        Name = reader.readLine();
        Cat catSon = new Cat(Name,catFather,catMother);
        Name = reader.readLine();
        Cat catDaughter = new Cat(Name,catFather,catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

/*

дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

        Cat name is дедушка Вася, no mother, no father
        Cat name is бабушка Мурка, no mother, no father
        Cat name is папа Котофей, no mother, father is дедушка Вася
        Cat name is мама Василиса, mother is бабушка Мурка, no father
        Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
        Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей*/
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "Cat name is " + name + ", no mother, no father ";
            else if (mother == null)
                return "Cat name is " + name + ", no mother, father is " + father.name;
            else if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
