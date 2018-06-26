package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 02.11.2017.
 */
public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();

    static Hippodrome game;

    static Horse winner;
    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {

        List<Horse> minihorse = new ArrayList<>();

        minihorse.add(new Horse("Белка",3,0));
        minihorse.add(new Horse("Стрелка",3,0));
        minihorse.add(new Horse("Бешенный",3,0));

        game = new Hippodrome(minihorse);
        game.run();
        game.printWinner();

    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }
    public void move(){
        for(Horse horse : horses){
            horse.move();
        }
    }
    public void print(){
        for(Horse horse : horses){
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse winner = null;
        double maxDistance = 0;
        for (Horse h:horses) {
            if(h.getDistance()>maxDistance)
                maxDistance = h.getDistance();
        }
        for (Horse h:horses) {
            if(h.getDistance()==maxDistance)
                winner = h;
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
