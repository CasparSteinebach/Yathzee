package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Speler {
    boolean spel = true;
    int worpAantal = 0;
    String naam;
    Worp worp = new Worp();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> lijst = new ArrayList<>();

    Speler(String naam){
        this.naam = naam;
    }

    Speler(ArrayList<Integer> lijst){
        this.lijst = lijst;
    }

    public void spelen() {

        while (spel) {
            worp.setArrays();
            System.out.println("Hallo " + this.naam);
            System.out.println("Gooi de dobbelstenen met [ENTER] of verlaat Yathzee met [q]");
            String invoer = scanner.nextLine();
            if (invoer.equals("q")) {
                spel = false;
            }
            if (invoer.isEmpty()) {
                worp.getWorp();
                worpAantal++;
                for (int i = 0; i < 3; i++) {
                    System.out.println("Dit was worp: " + worpAantal);
                    System.out.println("Wat wil je vasthouden? (toets [q] om het spel te verlaten)");
                    System.out.println("toets de nummers van de dobbelstenen die je wilt houden.");
                    System.out.println("een dobbelsteen met x heb je al gekozen. Toets [ENTER] om een beurt over te slaan.");
                    worp.vasthouden();
                    worp.flushArrays();
                    worp.printUitslag();
                    worpAantal++;
                    if (worpAantal == 3) {
                        spel = false;
                    }
                    System.out.println("jouw gegooide dobbelstenen: ");
                    worp.getVerzamelijst();
                    worp.getWorp();

                }
                worpAantal = 0;
            }
        }
    }

    public void worpenlijstSpeler(){
        this.lijst = worp.getVerzamelijst();
        for(int i = 0; i < this.lijst.size(); i++){
            System.out.print(this.lijst.get(i) + " ");
        }
    }


}



