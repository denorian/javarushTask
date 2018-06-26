package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
        while (bufferedReader1.ready()) {
            list1.add(bufferedReader1.readLine());
        }
        bufferedReader1.close();
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
        while (bufferedReader2.ready()) {
            list2.add(bufferedReader2.readLine());
        }
        bufferedReader2.close();


        int i = 0, j = 0;
        if (list1.size() > list2.size()) {
            try {
                for (i = 0, j = 0; i < list1.size() || j < list2.size(); i++, j++) {
                    if (list1.get(i).equals(list2.get(j))) {
                        lines.add(new LineItem(Type.SAME, list1.get(i)));
                    }
                    else if (list1.get(i).equals(list2.get(j+1))) {
                        lines.add(new LineItem(Type.ADDED, list2.get(j)));
                        i--;
                    }
                    else {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                        j--;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                lines.add(new LineItem(Type.REMOVED, list1.get(i)));
            }
        }
        else {
            try {
                for (i = 0, j = 0; i < list1.size() || j < list2.size(); i++, j++) {
                    if (list1.get(i).equals(list2.get(j))) {
                        lines.add(new LineItem(Type.SAME, list1.get(i)));
                    }
                    else if (list1.get(i).equals(list2.get(j+1))) {
                        lines.add(new LineItem(Type.ADDED, list2.get(j)));
                        i--;
                    }
                    else {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                        j--;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                lines.add(new LineItem(Type.ADDED, list2.get(j)));
            }
        }
        System.out.println(lines.toString());

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        public String toString() {
            return type.toString() + " " + line;
        }
    }
}
