package com.example.guessing_game_lab;

public class GuessingGame {
    private int numToBeGuessed;
    private int upper;
    private int lower;
    private int lives;
    private int gameStatus;




    public int getNumToBeGuessed() {
        return numToBeGuessed;
    }
    public void setNumToBeGuessed(int numToBeGuessed) {
        this.numToBeGuessed = numToBeGuessed;
    }


    public int getUpper() {
        return upper;
    }

    public void setUpper(int upper) {
        this.upper = upper;
    }


    public int getLower() {
        return lower;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }


    public void getRanNum (String upper, String lower) {
        if (!upper.isBlank()) {
            setUpper(Integer.parseInt(upper));
        }else {
            setUpper(0);
        }

        if (!lower.isBlank()) {
            setLower(Integer.parseInt(lower));
        }else {
            setLower(0);
        }
        int ranNum = (int)(Math.random() * (getUpper() - getLower() + 1) + getLower());
        setNumToBeGuessed(ranNum);
    }

    public int getGameStatus() {
        return gameStatus;
    }


    public void setGameStatus(int gameStatus) {
        this.gameStatus = gameStatus;
    }


    public void setHowManyGuessesAreLeft (int lives){
        this.lives = lives;
    }

    public String howManyGuessesAreLeft () {
        lives = lives - 1;
        switch (lives) {
            case 2:
                return "Dang not quite, guess again.";
            case 1:
                return "Careful you have one more guess.";
        }
        setGameStatus(0);
        return "WOMP WOMP you ran out of lives better luck next time.";
    }

    public String isTheGuessCorrect (String usersGuess) {
        if (usersGuess.isBlank()) {
            return "Please input your guess.";
        } else if (Integer.parseInt(usersGuess) == getNumToBeGuessed()) {
            setGameStatus(0);
            return "You're a winner!!!";
        }
        return howManyGuessesAreLeft();
    }


}
