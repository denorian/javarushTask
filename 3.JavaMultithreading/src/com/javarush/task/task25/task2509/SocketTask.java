package com.javarush.task.task25.task2509;

import java.net.Socket;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public abstract class SocketTask<T> implements CancellableTask<T> {
    private Socket socket;

    protected synchronized void setSocket(Socket socket) {
        this.socket = socket;
    }

    public synchronized void cancel() {
        //close all resources here
        try {
            if(socket != null){
                socket.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public RunnableFuture<T> newTask() {
        return new FutureTask<T>(this) {
            public boolean cancel(boolean mayInterruptIfRunning) {
                try {
                    SocketTask.this.cancel();
                }catch (Exception e){}
                finally {
                    return super.cancel(mayInterruptIfRunning);
                }
            }
        };
    }
}