package com.adadu.formatter;

public class Formatter {
String originalText;
    public Formatter(String originalText) {

        this.originalText = originalText.trim();
    }

    // formatted diffusion
   public String format(String textToFormat) {
       char[] myFormatArray = new char[this.originalText.length()];
       // checks if the length of the two strings are equal
       if (textToFormat.length() > this.originalText.length()) {
           System.out.println("The text to format must be less than or equal to the original text length");
           System.exit(-1);
       } else {

           int count = 0;
           for (int i = 0; i < this.originalText.length(); i++) {

               if (this.originalText.charAt(i) == ' ') {
                   myFormatArray[i] = ' ';
                   count++;
               } else if (Character.isUpperCase(this.originalText.charAt(i))) {
                    myFormatArray[i] = Character.toUpperCase(textToFormat.charAt(i - count));
                } else {
                    myFormatArray[i] = Character.toLowerCase(textToFormat.charAt(i - count));
                }
           }// for loop

       }// else check equality
       return String.valueOf(myFormatArray);
   }
    }// format()

