package org.example;

public class Player {
    private char[] player = {'X', 'O'};
    private int currentIndex = 0;

    public char[] getPlayer() {
        return player;
    }
    public int getCurrentIndex() {
        return currentIndex;
    }

    public void changeTurn() {
        currentIndex = (currentIndex + 1) % player.length;
    }
}

