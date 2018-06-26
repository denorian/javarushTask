package com.javarush.task.task14.task1421;

/**
 * Created by Александр on 19.08.2017.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }
}
