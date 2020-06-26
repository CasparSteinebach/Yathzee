package com.company;

import java.util.Scanner;

public class YahtzeeSpel {
    Speler speler = new Speler();
    Scanner scanner = new Scanner(System.in);
    boolean spel = true;
    int worpAantal = 0;

    public void spelen(){

        while(spel){
            Worp worp = new Worp();
            worp.setArrays();
            System.out.println("Gooi de dobbelstenen met [ENTER] of verlaat Yathzee met [q]");
            String invoer = scanner.nextLine();
            if (invoer.equals("q")){
                spel = false;
            }
            if (invoer.isEmpty()){
                worp.getWorp();
                worpAantal++;
                for(int i = 0; i < 3; i++){
                    System.out.println("Dit was worp: " + worpAantal);
                    System.out.println("Wat wil je vasthouden? (toets [q] om het spel te verlaten)");
                    System.out.println("toets de nummers van de dobbelstenen die je wilt houden.");
                    System.out.println("een dobbelsteen met x heb je al gekozen. Toets [ENTER] om een beurt over te slaan.");
                    worp.vasthouden();
                    worp.flushArrays();
                    worp.printUitslag();
                    worp.getVerzamelijst();
                    speler.worpenlijstSpeler();
                    worp.getWorp();
                    worpAantal++;
                }
                worpAantal=0;
            }
        }
    }
}

