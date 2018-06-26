package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen("Ukraine");
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            if (country.equals("Belarus")) return new BelarusianHen();
            else if (country.equals("Ukraine")) return new UkrainianHen();
            else if (country.equals("Moldova")) return new MoldovanHen();
            else return new RussianHen();
        }
    }
}


