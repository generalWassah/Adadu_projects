package com.adadu.algorithms;
import com.adadu.formatter.Formatter;
public class East {
    // The East function( can be iterated )
/** This class represents one of the four algorithms(functions) which we will call 'East' with following implementation.
   Given the following homogenous linear Diophantine equation A1*X1 + A2*X2 + ... + Ai-1*Xi-1 + Ai*Xi = 0.
   where, all Ai's and Xi's represents the coefficients and variables respectively. The solution according to the East function
   is as follows.
   Xn+1 = Xn + An + An+1, n = 0,1,2,...,i
   This solution is possible because 0 which is the constant in the equation above is always divisible by the greatest common
   divisor of any given set of integers.
   In order to ensure consistency of the function, there is need to define the term A0*X0 which are inputs to the function
   where  X0 = -(A1+A2+A3+...+An-1+An),
          A0 = 0.
   The East function has an inverse function called the West function. In order to recover all Ai's from all Xi's, all the Xi's
   is fed into the West function as input.
   The four algorithms(functions) are collectively referred as NEWS functions. Where the word 'NEWS' is derived from the initials
   of the function names.
   Note: inverse exists only when n%2 = 0. i.e the input is even
*/

    // This method takes a string and returns the first orbit of the iterated sequence
    
    String text;
    String initText;
    String originalText;
    Formatter formatter;
      public East(String text){
          this.originalText=text;
          this.text=text.replaceAll("\\s", "").trim().toUpperCase();
          this.initText=this.text;
          formatter = new Formatter(this.originalText);
      }
       private int getEastSum() {
           int len = this.initText.length();
          int msgNsum = 0;
           for (int i = 0; i < len; i++) {
               msgNsum = ((msgNsum - ((int)this.initText.charAt(i) - 65)) % 26 + 26) % 26;
           }// for i
           return msgNsum;
       }
       public String getEastDiffusion(int dIndex){

                String diffusedText="";
                int len = this.initText.length();
                int msgNsum = getEastSum();
            int a1 = 0, x1 = msgNsum;
            int a2 , x2;
            char[] dChar = new char[len];
            for (int j = 0; j < len; j++) {
                a2 = (int)this.initText.charAt(j) - 65;
                x2 = ((a2 + x1 + a1 ) % 26 + 26) % 26;

                dChar[j] = (char) (x2 + 65);

                x1 = x2;
                a1 = a2;
            }
           if ((dIndex > -1) && (dIndex < this.initText.length()) && (this.initText.length() % 2 == 1)) {
               dChar[dIndex] = (char)(msgNsum + 65);
           }
           diffusedText = String.valueOf(dChar);
            return diffusedText;
        }//

    public String getFirstOrbit(int dIndex){
        this.initText = this.text;
        return formatter.format(this.getEastDiffusion(dIndex));
    }
    public String getLastOrbit(int dIndex){
        this.initText=this.text;
        String lastOrbit = "";
        if(this.initText.length()%2==0) {
            West west = new West(this.initText);
            lastOrbit = formatter.format(west.getFirstOrbit(dIndex));
        }else{
            EastReversed eastReversed = new EastReversed(this.initText);
            lastOrbit = formatter.format(eastReversed.getFirstOrbit(dIndex));
        }

        return lastOrbit;
    }
    public String getOrbitAt(int noOfIters, int dIndex) {
        this.initText = this.text;
        String orbitAt = "";
        int i = 1;
        while (true) {
            orbitAt = this.getEastDiffusion(dIndex);
            if (i == noOfIters || orbitAt.equals(this.text)) {
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
            orbitsInRange = this.getEastDiffusion(dIndex);
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
        String firstOrbit = "";

        firstOrbit = this.getEastDiffusion(dIndex);

        System.out.println(1+" "+formatter.format(firstOrbit));
        this.initText = firstOrbit;
        String orbitGen = "";
        int t = 2;
        while (true) {
            orbitGen = this.getEastDiffusion(dIndex);
            if (firstOrbit.equals(orbitGen)) {
                break;
            }
            System.out.println((t++)+" "+formatter.format(orbitGen));
            this.initText = orbitGen;
        }
    }// print all orbit
    public void printCollisions(int dIndex) {
        this.initText = this.text;
        String firstOrbit = this.getEastDiffusion(dIndex);
        int strLen = firstOrbit.length();
        if (strLen % 2 == 1) {
            String[] collisions = new String[26];
            char[] textChars = new char[strLen];
            int sz = 25;
            while (sz > -1) {
                int a1 = 0, x1 = sz;
                int a2 = 0, x2 = 0;

                for (int j = 0; j < strLen; j++) {
                    x2 = (int)firstOrbit.charAt(j)-65;;
                    a2 = ((x2 - x1 - a1) % 26 + 26) % 26;
                    textChars[j] = (char)(a2+65);
                    a1 = a2;
                    x1 = x2;
                } //  loop
                collisions[sz] = formatter.format(String.valueOf(textChars));
                //textChars.splice(0, firstOrbit.length);
                if (sz == 0) {
                    break;
                }
                sz--;
            }// while loop
            for (int i = 0; i < 26; i++) {
                System.out.println((i+1)+" "+collisions[i]+" "+i);
            }
        } else {

            System.out.println("The length of the text is even and therefore has no collisions");

        }
    }// print collisions
    /*
    //print all orbits in such a way as to recover odd input
    public void recoverOddInput(String newText){
        if(newText.length()%2!=0){
            System.out.println("Even length of character expected");
       System.exit(99);
        }
        char rec = (char)((26-msgNsum)+65);
        printAllOrbits(newText+rec);
    }

*/
    }// class
