package com.javarush.task.task14.task1408;

/**
 * Created by Александр on 18.08.2017.
 */
public class MoldovanHen extends Hen{
    public int getCountOfEggsPerMonth() {
        return 80;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ;
    }
}
