package com.javarush.task.task14.task1417;

/**
 * Created by Александр on 19.08.2017.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
