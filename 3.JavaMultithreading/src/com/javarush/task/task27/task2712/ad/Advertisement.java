package com.javarush.task.task27.task2712.ad;

// рекламное объявление
public class Advertisement implements Cloneable {
    // видео
    private Object content;
    // имя/название
    private String name;
    // начальная сумма, стоимость рекламы в копейках
    private long initialAmount;
    // количество оплаченных показов
    private int hits;
    // продолжительность в секундах
    private int duration;
    // стоимости одного показа рекламного объявления в копейках
    private long amountPerOneDisplaying;

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        if (hits != 0)
            this.amountPerOneDisplaying = initialAmount / hits;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public int getHits() {
        return hits;
    }

    public void revalidate() {
        if (hits <= 0)
            throw new NoVideoAvailableException();
        hits--;
    }
}
