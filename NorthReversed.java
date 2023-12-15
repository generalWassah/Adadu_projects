package com.adadu.algorithms;
import com.adadu.formatter.Formatter;
import java.util.Arrays;

public class NorthReversed {
    String text;
    String initText;
    String originalText;
    Formatter formatter;
    public NorthReversed(String text){
        this.originalText = text;
        this.text = text.replaceAll("\\s", "").trim().toUpperCase();
        this.initText = this.text;
        formatter = new Formatter(this.originalText);
    }

    private int getNorthReversedSum(int dIndex){

        if(this.initText.length()%2!=1){
            System.out.println("odd string length expected");
            System.exit(1);
        }

        int text1Sum = 0, text2Sum = 0;
        int textTsum = 0;
        int mySign = 1;
        if (dIndex % 2 == 0) {
            mySign = -1;
        }
        int aski = 0;
        for (int i = 0; i < this.initText.length(); i++) {
            if (i != dIndex) {
                aski = (int)this.initText.charAt(i) - 65;
                if (i % 2 == 0) {
                    text1Sum = ((text1Sum + (mySign) * aski) % 26 + 26) % 26;
                } else {
                    text2Sum = ((text2Sum - (mySign) * aski) % 26 + 26) % 26;
                }
            } else {
                continue;
            }
        }// for loop
        textTsum = (text1Sum + text2Sum) % 26;
        return textTsum;
    }// getInNorthSum
    public String getNorthReversedDiffusion(int dIndex){

        if(this.initText.length()%2!=1){
            System.out.println("odd string length expected");
            System.exit(1);
        }

        int textTsum = getNorthReversedSum(dIndex);
        char discardedChar = (char)(textTsum + 65);
        char[] dChar = this.initText.toCharArray();
        dChar[dIndex] = discardedChar;
        char[] newArray = new char[dChar.length];

        int a1 = 0, x1 = (int)this.initText.charAt(dIndex) - 65;
        int a2 = 0, x2 = 0;
        // diffusion function
        for (int j = 0; j < dChar.length; j++) {
            x2 = (int)dChar[j] - 65;
            a2 = ((-x2 + x1 - a1) % 26 + 26) % 26;
            newArray[j] = (char) (a2 + 65);
            a1 = a2;
            x1 = x2;
        } // for loop for diffusion function
        String inNorthDiffusedText = String.valueOf(newArray);
        return inNorthDiffusedText;
    }// getInNorthDiffusion

    public String getFirstOrbit(int dIndex) {
        this.initText = this.text;
        return formatter.format(this.getNorthReversedDiffusion(dIndex));
    }// first orbit
    public String getLastOrbit(int dIndex){
        this.initText = this.text;
        North north = new North(this.initText);
        return formatter.format(north.getFirstOrbit(dIndex));
    }
    public String getOrbitAt(int index, int dIndex) {
        this.initText = this.text;
        int i = 1;
        while (true) {
            String orbitAt = this.getNorthReversedDiffusion(dIndex);
            if (i == index || orbitAt.equals(this.text)) {
                return formatter.format(orbitAt);
            }
            this.initText = orbitAt;
            i++;
        }//while
    }// orbitAt
    public void printOrbitsInRange(int range, int dIndex) {
        this.initText = this.text;
        String orbitsInRange = "";
        int i = 1;
        while (range > 0) {
            orbitsInRange = this.getNorthReversedDiffusion(dIndex);
            System.out.println(i++ +" "+formatter.format(orbitsInRange));
            if (orbitsInRange.equals(this.text)) {
                break;
            }
            this.initText = orbitsInRange;
            range--;

        }
    }// printOrbitsInRange
    public void printAllOrbits(int dIndex) {
        this.initText = this.text;
        int t = 1;
        while (true) {
            String orbitGen = this.getNorthReversedDiffusion(dIndex);
            System.out.println(t++ +" "+formatter.format(orbitGen));
            if (this.text.equals(orbitGen)) {
                break;
            }
            this.initText = orbitGen;
        }
    }// print all orbit

}//class
