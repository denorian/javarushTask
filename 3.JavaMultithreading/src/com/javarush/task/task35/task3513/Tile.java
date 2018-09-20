package com.javarush.task.task35.task3513;

import java.awt.*;

public class Tile {
    int value;

    public Tile(int value) {
        this.value = value;
    }

    public Tile() {
        this.value = 0;
    }

    public boolean isEmpty(){
        return this.value == 0;
    }

    public Color getFontColor(){
        return  this.value  < 16 ? new Color(0x776e65) : new Color(0xf9f6f2);
    }

    public Color getTileColor(){
        Color color;

        switch (this.value){
            case 0:
                color = new Color(0xcdc1b4);
                break;
            case 2:
                color = new Color(0xeee4da);
                break;
            case 4:
                color = new Color(0xede0c8);
                break;
            case 8:
                color = new Color(0xf2b179);
                break;
            case 16:
                color = new Color(0xf59563);
                break;
            case 32:
                color = new Color(0xf67c5f);
                break;
            case 64:
                color = new Color(0xf65e3b);
                break;
            case 128:
                color = new Color(0xedcf72);
                break;
            case 256:
                color = new Color(0xedcc61);
                break;
            case 512:
                color = new Color(0xedc850);
                break;
            case 1024:
                color = new Color(0xedc53f);
                break;
            case 2048:
                color = new Color(0xedc22e);
                break;
            case 4096:
                color = new Color(0x0edc22);
                break;
            case 8192:
                color = new Color(0x0a4c22);
                break;
            default:
                color = new Color(0xff0000);
        }

        return color;
    }
}
