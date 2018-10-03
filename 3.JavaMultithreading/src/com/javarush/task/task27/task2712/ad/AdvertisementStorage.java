package com.javarush.task.task27.task2712.ad;

public class AdvertisementStorage {
    private static AdvertisementStorage ourInstance = new AdvertisementStorage();

    public static AdvertisementStorage getInstance() {
        return ourInstance;
    }

    private AdvertisementStorage() {
    }
}
