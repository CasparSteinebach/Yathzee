package com.company;

import java.util.Scanner;

public class YahtzeeSpel {
    Scanner scanner = new Scanner(System.in);
    Speler speler1 = new Speler("Sjaak");
    Speler speler2 = new Speler("Piet");

    public void spelen(){
        System.out.println("****** WELKOM BIJ YAHTZEE ******");
        System.out.println("Speler 1, wat is je naam? ");
        speler1.naam = scanner.nextLine();
        System.out.println("Speler 2, wat is je naam? ");
        speler2.naam = scanner.nextLine();
        speler1.spelen();
        speler2.spelen();
        System.out.println("worpen " + speler1.naam);
        speler1.worpenlijstSpeler();
        System.out.println();
        System.out.println("worpen " + speler2.naam);
        speler2.worpenlijstSpeler();
    }

    /*
    public void spelen() {

        while (spel) {
            Worp worp = new Worp();
            worp.setArrays();
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
                    System.out.println("jouw gegooide dobbelstenen: ");
                    worp.getVerzamelijst();
                    speler1.worpenlijstSpeler();
                    worp.getWorp();
                    worpAantal++;
                    if (worpAantal == 3) {
                        spel = false;
                    }
                }
                worpAantal = 0;
            }
        }
    }

     */
}


