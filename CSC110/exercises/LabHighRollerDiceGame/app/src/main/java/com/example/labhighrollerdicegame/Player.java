package com.example.labhighrollerdicegame;

public class Player {
    private String name = "";
    private int score = 0;



    public String getName() {
        if (name.isBlank()) {
            return "[NO NAME FOUND]";
        }
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()){
            this.name = name;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
