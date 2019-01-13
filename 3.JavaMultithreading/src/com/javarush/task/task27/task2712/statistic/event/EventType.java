package com.javarush.task.task27.task2712.statistic.event;

public enum EventType {
    // повар приготовил заказ
    COOKED_ORDER,
    // выбрали набор видео-роликов для заказа
    SELECTED_VIDEOS,
    // нет ни одного видео-ролика, который можно показать во время приготовления заказа
    NO_AVAILABLE_VIDEO
}
