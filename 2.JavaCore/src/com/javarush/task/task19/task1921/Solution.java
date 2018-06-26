package com.javarush.task.task19.task1921;

import java.io.*;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        String fileName = args[0];

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String nameStr = line.replaceAll("[\\w]", "").trim();
                String[] digitalParts = line.substring(nameStr.length()).trim().split(" ");
                int day = Integer.parseInt(digitalParts[0]);
                int month = Integer.parseInt(digitalParts[1]);
                int year = Integer.parseInt(digitalParts[2]);
                Date date = new GregorianCalendar(year, month-1, day).getTime();

                PEOPLE.add(new Person(nameStr, date));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
