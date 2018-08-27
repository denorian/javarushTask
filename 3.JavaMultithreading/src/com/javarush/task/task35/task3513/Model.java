package com.javarush.task.task35.task3513;

import java.util.*;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
    int score;
    int maxTile;
    private boolean isSaveNeeded = true;
    private Stack previousStates = new Stack();
    private Stack previousScores = new Stack();

    public Model() {
        resetGameTiles();
    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }

    private List<Tile> getEmptyTiles() {
        ArrayList<Tile> list = new ArrayList();
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                if (gameTiles[i][j].isEmpty()) {
                    list.add(gameTiles[i][j]);
                }
            }
        }

        return list;
    }

    private void addTile() {
        List<Tile> emptyList = getEmptyTiles();
        if (emptyList != null && emptyList.size() != 0) {
            Tile tile = emptyList.get((int) (Math.random() * emptyList.size()));
            int tileWeight = Math.random() < 0.9 ? 2 : 4;
            tile.value = tileWeight;
        }
    }

    protected void resetGameTiles() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

    private boolean compressTiles(Tile[] tiles) {
        int counter = 0;
        boolean isChanged = false;
        int values[] = new int[tiles.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = 0;
        }

        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i].value != 0) {
                values[counter] = tiles[i].value;
                counter++;
            }
        }

        for (int i = 0; i < tiles.length; i++) {
            if (values[i] != tiles[i].value) {
                isChanged = true;
            }
            tiles[i].value = values[i];
        }

        return isChanged;
    }

    private boolean mergeTiles(Tile[] tiles) {
        boolean isChanged = false;
        for (int i = 0; i < tiles.length - 1; i++) {
            if (tiles[i].value == tiles[i + 1].value && tiles[i].value != 0) {
                tiles[i].value = tiles[i].value * 2;
                score = score + tiles[i].value;
                if (tiles[i].value > maxTile) {
                    maxTile = tiles[i].value;
                }
                for (int j = 2; j <= tiles.length - i; j++) {
                    try {
                        tiles[i + j - 1].value = tiles[i + j].value;
                    } catch (Exception e) {
                        tiles[i + j - 1].value = 0;
                        isChanged = true;
                    }
                }
            }
        }
        return isChanged;
    }
    
    public void left() {
        if (isSaveNeeded)
            saveState(gameTiles);

        boolean isChanged = false;
        for (int i = 0; i < FIELD_WIDTH; i++) {
            if (compressTiles(gameTiles[i])) {
                isChanged = true;
            }
            if (mergeTiles(gameTiles[i])) {
                isChanged = true;
            }
        }
        if (isChanged) {
            addTile();
        }

        isSaveNeeded = true;
    }

    private void rotate() {
        Tile tmp;
        for (int i = 0; i < FIELD_WIDTH / 2; i++) {
            for (int j = i; j < FIELD_WIDTH - 1 - i; j++) {
                tmp = gameTiles[i][j];
                gameTiles[i][j] = gameTiles[FIELD_WIDTH-j-1][i];
                gameTiles[FIELD_WIDTH-j-1][i] = gameTiles[FIELD_WIDTH-i-1][FIELD_WIDTH-j-1];
                gameTiles[FIELD_WIDTH-i-1][FIELD_WIDTH-j-1] = gameTiles[j][FIELD_WIDTH-i-1];
                gameTiles[j][FIELD_WIDTH-i-1] = tmp;
            }
        }
    }

    void right() {
        saveState(gameTiles);
        rotate();
        rotate();
        left();
        rotate();
        rotate();
    }
    void up() {
        saveState(gameTiles);
        rotate();
        rotate();
        rotate();
        left();
        rotate();
    }
    void down() {
        saveState(gameTiles);
        rotate();
        left();
        rotate();
        rotate();
        rotate();
    }

     public boolean canMove(){
        if(!getEmptyTiles().isEmpty())
            return true;

        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if(gameTiles[i][j].value == gameTiles[i][j-1].value)
                    return true;
            }
        }

        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if(gameTiles[j][i].value == gameTiles[j-1][i].value)
                    return true;
            }
        }

        return false;
    }

    private void saveState(Tile[][] tiles){
        Tile[][] tempTile = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++){
            for (int j = 0; j < FIELD_WIDTH; j++) {
                tempTile[i][j] = new Tile(tiles[i][j].value);
            }
        }
        previousStates.push(tempTile);
        previousScores.push(score);
        isSaveNeeded = false;
    }

    public void rollback(){
        if (!previousStates.isEmpty() && !previousScores.isEmpty()) {
            gameTiles = (Tile[][]) previousStates.pop();
            score = (int) previousScores.pop();
        }
    }

    public void randomMove(){
        int n = ((int) (Math.random() * 100)) % 4;
        if(n == 0)
            left();
        if(n == 1)
            right();
        if(n == 2)
            up();
        if(n == 3)
            down();
    }

    private boolean hasBoardChanged(){
        Tile[][] prev = (Tile[][]) previousStates.peek();
        int currTile = 0;
        int prevTile = 0;
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                currTile += gameTiles[i][j].value;
                prevTile += prev[i][j].value;
            }
        }

        return currTile != prevTile;
    }

    public MoveEfficiency getMoveEfficiency(Move move){
        MoveEfficiency movEff = null;
        move.move();

        if (!hasBoardChanged()) {
            movEff = new MoveEfficiency(-1 ,0 ,move);
        } else {
            movEff = new MoveEfficiency(getEmptyTiles().size() ,score ,move);
        }
        rollback();
        return movEff;
    }

    public void autoMove(){
        PriorityQueue queue = new PriorityQueue(4, Collections.<MoveEfficiency>reverseOrder());
        queue.add(getMoveEfficiency(this::left));
        queue.add(getMoveEfficiency(this::right));
        queue.add(getMoveEfficiency(this::up));
        queue.add(getMoveEfficiency(this::down));
        MoveEfficiency efficientMove = (MoveEfficiency) queue.poll();
        efficientMove.getMove().move();
    }
}
