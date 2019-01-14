package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class StatisticManager {
    private static volatile StatisticManager instance = null;
    private StatisticStorage statisticStorage = new StatisticStorage();
    private Set<Cook> cooks = new HashSet<>();

    private StatisticManager() {
    }

    public static StatisticManager getInstance() {
        if (instance == null)
            instance = new StatisticManager();
        return instance;
    }

    public void register(EventDataRow data) {
        statisticStorage.put(data);
    }

    public void register(Cook cook) {
        cooks.add(cook);
    }

    public Set<Cook> getCooks() {
        return cooks;
    }

    public void setCooks(Set<Cook> cooks) {
        this.cooks = cooks;
    }

    public Map<Date, Double> getProfitReport() {
        Map<Date, Double> result = new TreeMap<>(Collections.reverseOrder());

        for (EventDataRow i : statisticStorage.getStorage().get(EventType.SELECTED_VIDEOS)) {
            VideoSelectedEventDataRow videoSelectedEventDataRow = (VideoSelectedEventDataRow) i;
            Date fullDate = videoSelectedEventDataRow.getDate();
            Date date = new Date(fullDate.getYear(), fullDate.getMonth(), fullDate.getDate());
            Double amount = new Double(videoSelectedEventDataRow.getAmount());

            if (result.containsKey(date))
                result.put(date, result.get(date) + amount);
            else
                result.put(date, amount);
        }

        return result;
    }

    public Map<Date, Map<String, Integer>> getCooksReport() {
        Map<Date, Map<String, Integer>> result = new TreeMap<>(Collections.reverseOrder());
        List<EventDataRow> eventDataRowList = statisticStorage.getStorage().get(EventType.COOKED_ORDER);

        for (EventDataRow i : eventDataRowList) {
            CookedOrderEventDataRow cookedOrderEventDataRow = (CookedOrderEventDataRow) i;
            Date fullDate = cookedOrderEventDataRow.getDate();
            Date date = new Date(fullDate.getYear(), fullDate.getMonth(), fullDate.getDate());

            String cookName = cookedOrderEventDataRow.getCookName();
            int addTime = new BigDecimal(((double) cookedOrderEventDataRow.getTime()) / 60).setScale(0, RoundingMode.UP).intValue();

            if (result.containsKey(date)) {
                if (result.get(date).containsKey(cookName)) {
                    int oldTime = result.get(date).get(cookName);
                    result.get(date).put(cookName, oldTime + addTime);
                } else {
                    result.get(date).put(cookName, addTime);
                }
            } else {
                Map<String, Integer> map = new TreeMap<>();
                map.put(cookName, addTime);
                result.put(date, map);
            }
        }

        return result;
    }


    // хранилище
    private class StatisticStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        public StatisticStorage() {
            for (EventType eventType : EventType.values()) {
                storage.put(eventType, new ArrayList<>());
            }
        }

        private void put(EventDataRow data) {
            storage.get(data.getType()).add(data);
        }

        public Map<EventType, List<EventDataRow>> getStorage() {
            return storage;
        }
    }
}
