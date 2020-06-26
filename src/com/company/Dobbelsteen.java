package com.company;

import java.util.Random;

public class Dobbelsteen {
    int worp;

    public Dobbelsteen(int worp){
        this.worp = worp;
    }

    public Dobbelsteen(){
    }

    public int werpen() {
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            worp = random.nextInt(6) + 1;
        }
        return worp;
    }
}
