package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/


public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int i;
        private int j;
        private int x;
        private String s;
        private String n;
        private String l;

        public Human(int i) {
            this.i = i;
        }

        public Human(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public Human(int i, int j, int x) {
            this.i = i;
            this.j = j;
            this.x = x;
        }

        public Human(int i, int j, int x, String s) {
            this.i = i;
            this.j = j;
            this.x = x;
            this.s = s;
        }

        public Human(int i, int j, int x, String s, String n) {
            this.i = i;
            this.j = j;
            this.x = x;
            this.s = s;
            this.n = n;
        }

        public Human(int i, int j, int x, String s, String n, String l) {
            this.i = i;
            this.j = j;
            this.x = x;
            this.s = s;
            this.n = n;
            this.l = l;
        }

        public Human(int j, int x, String s) {
            this.j = j;
            this.x = x;
            this.s = s;
        }

        public Human(int x, String s, String n) {
            this.x = x;
            this.s = s;
            this.n = n;
        }

        public Human(int x, String s, String n, String l) {
            this.x = x;
            this.s = s;
            this.n = n;
            this.l = l;
        }

        public Human(String n, String l) {
            this.n = n;
            this.l = l;
        }
        // напишите тут ваши переменные и конструкторы
    }
}
