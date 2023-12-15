package com.adadu.selectNEWS;

import com.adadu.algorithms.*;

public class SelectNEWS {

    // implementation

    String newDiffusedText = ""; //store diffused intermediate chars

    public String diffuseExtract(String extract, String newsFunction) {
        int ShannonsIndex = extract.length()/2;
        // choose the type of diffusion u want
        if (newsFunction.equals("N")) {
            North north = new North(extract);
            newDiffusedText = north.getNorthDiffusion(ShannonsIndex);
        }else if(newsFunction.equals("NR")){
            NorthReversed northReversed = new NorthReversed(extract);
            newDiffusedText = northReversed.getNorthReversedDiffusion(ShannonsIndex);
        } else if (newsFunction.equals("E")) {
            East east = new East(extract);
            newDiffusedText = east.getEastDiffusion(ShannonsIndex);
        } else if (newsFunction.equals("ER")) {
            EastReversed eastReversed = new EastReversed(extract);
            newDiffusedText = eastReversed.getEastReversedDiffusion(ShannonsIndex);
        } else if (newsFunction.equals("W")) {
            West west = new West(extract);
            newDiffusedText = west.getWestDiffusion(ShannonsIndex);
        } else if (newsFunction.equals("WR")) {
            WestReversed westReversed = new WestReversed(extract);
            newDiffusedText = westReversed.getWestReversedDiffusion(ShannonsIndex);
        } else if (newsFunction.equals("S")) {
            South south = new South(extract);
            newDiffusedText = south.getSouthDiffusion(ShannonsIndex);
        }else if (newsFunction.equals("SR")){
            SouthReversed southReversed = new SouthReversed(extract);
            newDiffusedText = southReversed.getSouthReversedDiffusion(ShannonsIndex);
        }else {
            System.out.println("Wrong option");
            System.exit(405);
        }
        return newDiffusedText;
    }// method DiffusionChoice

}// class SelectNEWS
