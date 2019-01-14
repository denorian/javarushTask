package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

public class OrderManager implements Observer {

    LinkedBlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();

    @Override
    public void update(Observable o, Object arg) {
        orderQueue.add((Order)arg);
    }

    public OrderManager() {
        this.orderQueue = orderQueue;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                Set<Cook> cooks = StatisticManager.getInstance().getCooks();
                while (true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                    }
                    if (!orderQueue.isEmpty()) {
                        for (Cook cook : cooks) {
                            if (!cook.isBusy()) {
                                Order order = orderQueue.poll();
                                if (order != null)
                                    cook.startCookingOrder(order);
                            }
                            if (orderQueue.isEmpty())
                                break;
                        }
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}
