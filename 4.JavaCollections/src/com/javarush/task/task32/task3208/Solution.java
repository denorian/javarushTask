package com.javarush.task.task32.task3208;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


/* 
RMI-2
*/
public class Solution {
    public static Registry registry;

    //pretend we start rmi client as CLIENT_THREAD thread
    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                for (String bindingName : registry.list()) {
                    Animal service = (Animal) registry.lookup(bindingName);
                    service.printName();
                    service.say();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
        }
    });

    //pretend we start rmi server as SERVER_THREAD thread
    public static Thread SERVER_THREAD;

    static {
        SERVER_THREAD = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    registry = LocateRegistry.createRegistry(2099);
                    final Animal barsik = new Cat("Barsik");
                    final Animal bobik = new Dog("Bobik");

                    Remote stubBarsik = UnicastRemoteObject.exportObject(barsik,0);
                    Remote stubBobik = UnicastRemoteObject.exportObject(bobik,0);

                    registry.bind("server.cat",stubBarsik);
                    registry.bind("server.dog",stubBobik);

                } catch (RemoteException e) {
                    e.printStackTrace();
                } catch (AlreadyBoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        //start rmi server thread
        SERVER_THREAD.start();
        Thread.sleep(1000);
        //start client
        CLIENT_THREAD.start();
    }
}