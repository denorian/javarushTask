package com.javarush.task.task25.task2506;

/**
 * Created by Александр on 25.12.2017.
 */
public class LoggingStateThread  extends Thread{
    private Thread target;
    private State prevState = null;

    public LoggingStateThread(Thread thread) {
        this.target = thread;
        this.setDaemon(true);
    }


    @Override
    public void run() {
        State state = this.target.getState();
        System.out.println(state);
        while (state != State.TERMINATED)
        {
            if (state != this.target.getState())
            {
                state = this.target.getState();
                System.out.println(state);
            }
        }
    }
}
