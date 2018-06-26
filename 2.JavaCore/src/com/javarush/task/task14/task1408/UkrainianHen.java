package com.javarush.task.task14.task1408;

/**
 * Created by Александр on 18.08.2017.
 */
public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 40;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ;
    }
}
