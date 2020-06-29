package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Speler {
    Worp w = new Worp();
    String naam;
    ArrayList<Integer> lijst = new ArrayList<>();

    Speler(String naam){
        this.naam = naam;
    }

    Speler(ArrayList<Integer> lijst){
        this.lijst = lijst;
    }


    public void worpenlijstSpeler(){
        this.lijst = w.getVerzamelijst();
        for(int i = 0; i < this.lijst.size(); i++){
            System.out.println("UITSLAG GODVERREDOMME" + this.lijst.get(i));
        }
    }


}



