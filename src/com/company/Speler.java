package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Speler {
    Worp w = new Worp();
    public void worpenlijstSpeler(){
        ArrayList<Integer> uitslag = w.getVerzamelijst();
        for(Integer w : uitslag){
            int i = 0;
            System.out.println("UITSLAG GODVERREDOMME" + uitslag.get(i));
            i++;
        }
    }


}



