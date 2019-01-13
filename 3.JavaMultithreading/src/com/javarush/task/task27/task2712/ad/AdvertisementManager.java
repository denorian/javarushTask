package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.NoAvailableVideoEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// объект менеджера
public class AdvertisementManager {
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() throws NoVideoAvailableException {
        List<Advertisement> advertisements = storage.list();

        Collections.sort(advertisements, new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                int res = 0;
                if (o1.getAmountPerOneDisplaying() != o2.getAmountPerOneDisplaying())
                    res = new Long(o2.getAmountPerOneDisplaying()).compareTo(new Long(o1.getAmountPerOneDisplaying()));
                else if (o1.getDuration() != o2.getDuration())
                    res = new Long(o2.getDuration()).compareTo(new Long(o1.getDuration()));
                return res;
            }
        });

        List<Advertisement> selectedVideos = selectionVideos(advertisements, 0, timeSeconds);

        long amount = 0;
        int totalDuration = 0;
        for (Advertisement i : selectedVideos) {
            amount += i.getAmountPerOneDisplaying();
            totalDuration += i.getDuration();
        }
        StatisticManager.getInstance().register(new VideoSelectedEventDataRow(selectedVideos, amount, totalDuration));

        for (Advertisement i : selectedVideos) {
            i.revalidate();
            ConsoleHelper.writeMessage(String.format("%s is displaying... %d, %d", i.getName(),
                    i.getAmountPerOneDisplaying(), i.getAmountPerOneDisplaying() * 1000 / i.getDuration()));
        }
    }

    private List<Advertisement> selectionVideos(List<Advertisement> availableVideos, int index, int remainderOfTime) {
        if (remainderOfTime == 0 || index >= availableVideos.size())
            return new ArrayList<Advertisement>();
        else if (availableVideos.get(index).getDuration() > remainderOfTime || availableVideos.get(index).getHits() <= 0)
            return selectionVideos(availableVideos, index + 1, remainderOfTime);
        else {
            List<Advertisement> selectedVideos = new ArrayList<>();
            selectedVideos.add(availableVideos.get(index));

            selectedVideos.addAll(selectionVideos(availableVideos, index + 1,
                    remainderOfTime - availableVideos.get(index).getDuration()));
            return selectedVideos;
        }
    }
}
