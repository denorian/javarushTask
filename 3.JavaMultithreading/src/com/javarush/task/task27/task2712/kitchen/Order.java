package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
        ConsoleHelper.writeMessage(this.toString());
    }

    @Override
    public String toString() {
        return dishes.size() != 0 ?
                String.format("Your order: %s of %s", Arrays.toString(dishes.toArray()), tablet) : "";
    }

    public int getTotalCookingTime(){
        return dishes.stream().mapToInt((s)->s.getDuration()).sum();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public boolean isEmpty(){
        return dishes.isEmpty();
    }

    public void initDishes() throws IOException {
        ConsoleHelper.writeMessage(Dish.allDishesToString());
        dishes = ConsoleHelper.getAllDishesForOrder();
    }
}
