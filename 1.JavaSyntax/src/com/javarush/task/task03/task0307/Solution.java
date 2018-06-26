package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код Создать 10 зергов, 5 протоссов и 12 терран.
        Zerg zerg1 = new Zerg();
        zerg1.name = "zerg1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "zerg2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "zerg3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "zerg4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "zerg5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "zerg6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "zerg7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "zerg8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "zerg9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "zerg10";

        Protoss protoss1 = new Protoss();
        protoss1.name = "prot1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "pro2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "prot3";
        Protoss protoss4 = new Protoss();
        protoss4.name = "prot4";
        Protoss protoss5 = new Protoss();
        protoss5.name = "prot5";


        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();

        terran1.name = "terran1";
        terran2.name = "terra2";
        terran3.name = "terran3";
        terran4.name = "terran4";
        terran5.name = "terran5";
        terran6.name = "terran6";
        terran7.name = "terran7";
        terran8.name = "terran8";
        terran9.name = "terran9";
        terran10.name = "terran10";
        terran11.name = "terran11";
        terran12.name = "terran12";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
