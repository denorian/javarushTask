package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true)//тут цикл по чтению ключей, пункт 1
        {

            key = reader.readLine();
            if (key.equals(Person.User.class.getSimpleName().toLowerCase()))
                person = new Person.User();
            else if(key.equals(Person.Loser.class.getSimpleName().toLowerCase()))
                person = new Person.Loser();
            else if(key.equals(Person.Coder.class.getSimpleName().toLowerCase()))
                person = new Person.Coder();
            else if(key.equals(Person.Proger.class.getSimpleName().toLowerCase()))
                person = new Person.Proger();
            else
                break;
            //создаем объект, пункт 2

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if(person instanceof Person.User)
            ((Person.User) person).live();
        if(person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        if(person instanceof Person.Coder)
            ((Person.Coder) person).coding();
        if(person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}
