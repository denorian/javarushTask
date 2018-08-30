package com.javarush.task.task25.task2515;

import java.util.ArrayList;

public class Space {
    private int height;
    private int width;
    //Космический корабль
    private SpaceShip ship;
    //Список НЛО
    private ArrayList<Ufo> ufos = new ArrayList<Ufo>();
    //Список бомб
    private ArrayList<Bomb> bombs = new ArrayList<Bomb>();
    //Список ракет
    private ArrayList<Rocket> rockets = new ArrayList<Rocket>();

    public static void main(String[] args) {

    }

    public Space(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public void run(){}
    public void draw(){}
    public void sleep(int ms){}
}
