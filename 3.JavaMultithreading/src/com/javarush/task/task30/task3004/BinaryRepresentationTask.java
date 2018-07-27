package com.javarush.task.task30.task3004;

import java.util.concurrent.RecursiveTask;

public class BinaryRepresentationTask extends RecursiveTask<String> {
    private int i;
    public BinaryRepresentationTask(int i) {
        this.i = i;
    }

    @Override
    protected String compute() {
        String result = String.valueOf(i % 2);
        if (i / 2 > 0) {
            BinaryRepresentationTask task = new BinaryRepresentationTask(i / 2);
            task.fork();
            return task.join() + result;
        }
        return result;
    }
}
