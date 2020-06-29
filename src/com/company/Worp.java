package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Worp {
    Scanner scanner = new Scanner(System.in);
    Dobbelsteen dobbelsteen = new Dobbelsteen();
    ArrayList<Integer> blokkeerArray = new ArrayList<Integer>();
    ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();
    ArrayList<Dobbelsteen> uitslagWorp = new ArrayList<Dobbelsteen>();
    ArrayList<Integer> verzamelLijst = new ArrayList<Integer>();

    void setArrays() {
        for (int i = 0; i < 5; i++) {
            int worp = dobbelsteen.werpen(); // werpen
            blokkeerArray.add(i, 0); // blokkeerarray resetten
            dobbelstenen.add(new Dobbelsteen(worp)); // worpen toevoegen
            uitslagWorp.add(new Dobbelsteen(0));
            verzamelLijst.add(worp);
        }
    }

    void getWorp() {
        System.out.println("1 2 3 4 5");
        int i = 0;
        for (Dobbelsteen w : dobbelstenen) {
            if (blokkeerArray.get(i) != 0) {
                System.out.print("x ");
            }
            if (blokkeerArray.get(i) == 0) {
                System.out.print(w.worp + " ");
            }
            i++;
        }
        System.out.println();
    }

    void flushArrays(){
        dobbelstenen.clear();
        //System.out.println("Dobbelstenen is leeg: " + dobbelstenen);
        for (int i = 0; i < 5; i++) {
            int worp = dobbelsteen.werpen();
            dobbelstenen.add(new Dobbelsteen(worp));
            if (blokkeerArray.get(i) == 0) {
                    verzamelLijst.add(worp);
                }
            }

        }

    public void printUitslag(){
        System.out.println("=================================");
        System.out.print("Jouw verzamelde dobbelstenen : ");
        System.out.println();
        for (Dobbelsteen w : uitslagWorp) {
            if(w.worp == 0){
                System.out.print("");
            } else {
                System.out.print(w.worp + " ");
                //verzamelLijst.add(w.worp);
            }
        }
        System.out.println();
        System.out.println("=================================");
        System.out.println();
    }

    public void vasthouden() {
        String invoer = scanner.nextLine();
        if (invoer.equals("q")) {
            System.exit(0);
        } else {
            for (int i = 0; i < invoer.length(); i++) {
                int j = Character.digit(invoer.charAt(i), 10);
                if (j == 1) {
                    blokkeerArray.set(0, 1);
                    uitslagWorp.set(0, dobbelstenen.get(0));
                }
                if (j == 2) {
                    blokkeerArray.set(1, 1);
                    uitslagWorp.set(1, dobbelstenen.get(1));
                }
                if (j == 3) {
                    blokkeerArray.set(2, 1);
                    uitslagWorp.set(2, dobbelstenen.get(2));
                }
                if (j == 4) {
                    blokkeerArray.set(3, 1);
                    uitslagWorp.set(3, dobbelstenen.get(3));
                }
                if (j == 5) {
                    blokkeerArray.set(4, 1);
                    uitslagWorp.set(4, dobbelstenen.get(4));
                }
            }
        }
    }

    public ArrayList<Integer> getVerzamelijst() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0; i < verzamelLijst.size(); i++){
            numbers.add(verzamelLijst.get(i));
            //System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        return(numbers);
    }
}

