package com.example.labhighrollerdicegame;

import java.util.Random;

public class Die {
    private int dieFace;
    public void roll(){

        do {
                dieFace = new Random().nextInt(7);
            } while (dieFace <= 0);

    }

    public int getDieFace() {
        return dieFace;
    }

}
