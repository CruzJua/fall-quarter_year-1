package com.example.labhighrollerdicegame;

public class Game {
    private int round = 0;
    private boolean isPlayerTurn1;
    private boolean isPlayerTurn2;
    private boolean isPlayerTurn3;

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isPlayerTurn1() {
        return isPlayerTurn1;
    }

    public void setPlayerTurn1(boolean playerTurn1) {
        isPlayerTurn1 = playerTurn1;
    }

    public boolean isPlayerTurn2() {
        return isPlayerTurn2;
    }

    public void setPlayerTurn2(boolean playerTurn2) {
        isPlayerTurn2 = playerTurn2;
    }

    public boolean isPlayerTurn3() {
        return isPlayerTurn3;
    }

    public void setPlayerTurn3(boolean playerTurn3) {
        isPlayerTurn3 = playerTurn3;
    }
}
