package com.adadu;
import java.util.Scanner;
import com.adadu.formatter.Formatter;
import com.adadu.algorithms.*;
import com.adadu.implementations.*;
//import com.adadu.key.*;
public class Main {

    public static void main(String[] args) {

        String originalMessage;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message");
        originalMessage = sc.nextLine();

        int msgLen = originalMessage.replaceAll("\\s", "").trim().length();
        int ShannonsIndex = 0;
        if(msgLen%2==1){
            System.out.print("Shannon's index: ");
            ShannonsIndex = sc.nextInt();
        }
        // declaring object variable for the algorithms
        North north = new North(originalMessage);
        NorthReversed northReversed = new NorthReversed(originalMessage);
        East east = new East(originalMessage);
        EastReversed eastReversed = new EastReversed(originalMessage);
        West west = new West(originalMessage);
        WestReversed westReversed = new WestReversed(originalMessage);
        South south = new South(originalMessage);
        SouthReversed southReversed = new SouthReversed(originalMessage);

        // object variable for the six different implementations
        InWard inWard = new InWard(originalMessage);
        OutWard outWard = new OutWard(originalMessage);

        RightWard rightWard = new RightWard(originalMessage);
        RightWardReversed rightWardReversed = new RightWardReversed(originalMessage);

        LeftWard leftWard = new LeftWard(originalMessage);
        LeftWardReversed leftWardReversed = new LeftWardReversed(originalMessage);

        Formatter formatter = new Formatter(originalMessage);

        System.out.println("Select option:\n 1.Algorithm(Function) \n 2.Implementation \n 3.Simple Encryption");

        int myNum = sc.nextInt();
        if (myNum == 1) {
            System.out.println("you have chosen Algorithm(Function)");
            System.out.println(
                    "Select option:\n 1.North function \n 2.East function \n 3.West function \n 4.South function \n 5.InNorth function \n 6.InEast function" +
                            "\n 7.InWest function \n 8.InSouth function");
            int chooseNEWS = sc.nextInt();
            if (chooseNEWS == 1) {// North function
                System.out.println("you have chosen North Function");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsInRange \n 5.printAllOrbits \n 6.printCollisions");
                int N_method = sc.nextInt();
                if (N_method == 1) {
                    System.out.println(north.getFirstOrbit(ShannonsIndex));
                } else if (N_method == 2) {
                    System.out.println(north.getLastOrbit(ShannonsIndex));
                } else if (N_method == 3) {
                    System.out.print("select index: ");
                    int N_index1 = sc.nextInt();
                    System.out.println(north.getOrbitAt(N_index1,ShannonsIndex));
                } else if (N_method == 4) {
                    System.out.print("select index: ");
                    int N_index2 = sc.nextInt();
                    north.printOrbitsInRange(N_index2,ShannonsIndex);
                } else if (N_method == 5) {
                    north.printAllOrbits(ShannonsIndex);
                } else if (N_method == 6) {
                    north.printCollisions(-1);
                }
                System.exit(11);
            }
            else if (chooseNEWS == 2) {// East function
                System.out.println("you have chosen East Function");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsInRange \n 5.printAllOrbits \n 6.printCollisions");
                int E_method = sc.nextInt();
                if (E_method == 1) {
                    System.out.println(east.getFirstOrbit(ShannonsIndex));
                } else if (E_method == 2) {
                    System.out.println(east.getLastOrbit(ShannonsIndex));
                } else if (E_method == 3) {
                    System.out.print("select index: ");
                    int E_index1 = sc.nextInt();
                    System.out.println(east.getOrbitAt(E_index1,ShannonsIndex));
                } else if (E_method == 4) {
                    System.out.print("select index: ");
                    int E_index2 = sc.nextInt();
                    east.printOrbitsInRange(E_index2,ShannonsIndex);
                } else if (E_method == 5) {
                    east.printAllOrbits(ShannonsIndex);
                } else if (E_method == 6) {
                    east.printCollisions(-1);
                }
                System.exit(22);
            }
            else if (chooseNEWS == 3) {// West function
                System.out.println("you have chosen West Function");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsInRange \n 5.printAllOrbits \n 6.printCollisions");
                int W_method = sc.nextInt();
                if (W_method == 1) {
                    System.out.println(west.getFirstOrbit(ShannonsIndex));
                } else if (W_method == 2) {
                    System.out.println(west.getLastOrbit(ShannonsIndex));
                } else if (W_method == 3) {
                    System.out.print("select index: ");
                    int W_index1 = sc.nextInt();
                    System.out.println(west.getOrbitAt(W_index1,ShannonsIndex));
                } else if (W_method == 4) {
                    System.out.print("select index: ");
                    int W_index2 = sc.nextInt();
                    west.printOrbitsInRange(W_index2,ShannonsIndex);
                } else if (W_method == 5) {
                    west.printAllOrbits(ShannonsIndex);
                } else if (W_method == 6) {
                    west.printCollisions(-1);
                }
                System.exit(33);
            }
            else if (chooseNEWS == 4) {// South function
                System.out.println("you have chosen South Function");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsInRange \n 5.printAllOrbits \n 6.printCollisions");
                int S_method = sc.nextInt();
                if (S_method == 1) {
                    System.out.println(south.getFirstOrbit(ShannonsIndex));
                } else if (S_method == 2) {
                    System.out.println(south.getLastOrbit(ShannonsIndex));
                } else if (S_method == 3) {
                    System.out.print("select index: ");
                    int S_index1 = sc.nextInt();
                    System.out.println(south.getOrbitAt(S_index1,ShannonsIndex));
                } else if (S_method == 4) {
                    System.out.print("select index: ");
                    int S_index2 = sc.nextInt();
                    south.printOrbitsInRange(S_index2,ShannonsIndex);
                } else if (S_method == 5) {
                    south.printAllOrbits(ShannonsIndex);
                } else if (S_method == 6) {
                    south.printCollisions(-1);
                }
                System.exit(44);
            }else if(chooseNEWS == 5){
                System.out.println("you have chosen InNorth Function");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsInRange \n 5.printAllOrbits");
                int IN_method = sc.nextInt();
                if (IN_method == 1) {
                    System.out.println(northReversed.getFirstOrbit(ShannonsIndex));
                } else if (IN_method == 2) {
                    System.out.println(northReversed.getLastOrbit(ShannonsIndex));
                } else if (IN_method == 3) {
                    System.out.print("select index: ");
                    int IN_index1 = sc.nextInt();
                    System.out.println(northReversed.getOrbitAt(IN_index1,ShannonsIndex));
                } else if (IN_method == 4) {
                    System.out.print("select index: ");
                    int IN_index2 = sc.nextInt();
                    northReversed.printOrbitsInRange(IN_index2,ShannonsIndex);
                } else if (IN_method == 5) {
                    northReversed.printAllOrbits(ShannonsIndex);
                }
                System.exit(55);
            }else if(chooseNEWS == 6){
                System.out.println("you have chosen InEast Function");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsInRange \n 5.printAllOrbits");
                int IE_method = sc.nextInt();
                if (IE_method == 1) {
                    System.out.println(eastReversed.getFirstOrbit(ShannonsIndex));
                } else if (IE_method == 2) {
                    System.out.println(eastReversed.getLastOrbit(ShannonsIndex));
                } else if (IE_method == 3) {
                    System.out.print("select index: ");
                    int IE_index1 = sc.nextInt();
                    System.out.println(eastReversed.getOrbitAt(IE_index1,ShannonsIndex));
                } else if (IE_method == 4) {
                    System.out.print("select index: ");
                    int IE_index2 = sc.nextInt();
                    eastReversed.printOrbitsInRange(IE_index2,ShannonsIndex);
                } else if (IE_method == 5) {
                    eastReversed.printAllOrbits(ShannonsIndex);
                }
                System.exit(66);
            }else if(chooseNEWS == 7){
                System.out.println("you have chosen InWest Function");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsInRange \n 5.printAllOrbits");
                int IW_method = sc.nextInt();
                if (IW_method == 1) {
                    System.out.println(westReversed.getFirstOrbit(ShannonsIndex));
                } else if (IW_method == 2) {
                    System.out.println(westReversed.getLastOrbit(ShannonsIndex));
                } else if (IW_method == 3) {
                    System.out.print("select index: ");
                    int IW_index1 = sc.nextInt();
                    System.out.println(westReversed.getOrbitAt(IW_index1,ShannonsIndex));
                } else if (IW_method == 4) {
                    System.out.print("select index: ");
                    int IW_index2 = sc.nextInt();
                    westReversed.printOrbitsInRange(IW_index2,ShannonsIndex);
                } else if (IW_method == 5) {
                    westReversed.printAllOrbits(ShannonsIndex);
                }
                System.exit(77);
            }else if(chooseNEWS == 8){
                System.out.println("you have chosen InSouth Function");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsInRange \n 5.printAllOrbits");
                int IS_method = sc.nextInt();
                if (IS_method == 1) {
                    System.out.println(southReversed.getFirstOrbit(ShannonsIndex));
                } else if (IS_method == 2) {
                    System.out.println(southReversed.getLastOrbit(ShannonsIndex));
                } else if (IS_method == 3) {
                    System.out.print("select index: ");
                    int IS_index1 = sc.nextInt();
                    System.out.println(southReversed.getOrbitAt(IS_index1,ShannonsIndex));
                } else if (IS_method == 4) {
                    System.out.print("select index: ");
                    int IS_index2 = sc.nextInt();
                    southReversed.printOrbitsInRange(IS_index2,ShannonsIndex);
                } else if (IS_method == 5) {
                    southReversed.printAllOrbits(ShannonsIndex);
                }
                System.exit(88);
            }
            else {
                System.out.println("option does not exists");
                System.exit(55);
            }

        } else if (myNum == 2) { // implementation
            System.out.println("you have chosen Implementation");
            System.out.println(
                    "Select option:\n 1.InWard \n 2.OutWard \n 3.RightWard \n 4.RightWardReversed \n 5.LeftWard \n 6.LeftWardReversed");
            int implementNEWS = sc.nextInt();
            String diffType;
            if (implementNEWS == 1) {// InWard
                System.out.println("you have chosen InWard Implementation");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsUpTo \n 5.printAllOrbits");
                int i_method = sc.nextInt();
                if (i_method == 1) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(inWard.getFirstOrbit(diffType));
                } else if (i_method == 2) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(inWard.getLastOrbit(diffType));
                } else if (i_method == 3) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int i_index1 = sc.nextInt();
                    System.out.println(inWard.getOrbitAt(i_index1, diffType));
                } else if (i_method == 4) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int i_index2 = sc.nextInt();
                    inWard.printOrbitsInRange(i_index2, diffType);
                } else if (i_method == 5) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    inWard.printAllOrbits(diffType);
                }

            } else if (implementNEWS == 2) {// OutWard
                System.out.println("you have chosen outWard Implementation");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsUpTo \n 5.printAllOrbits");
                int o_method = sc.nextInt();
                if (o_method == 1) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(outWard.getFirstOrbit(diffType));
                } else if (o_method == 2) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(outWard.getLastOrbit(diffType));
                } else if (o_method == 3) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int o_index1 = sc.nextInt();
                    System.out.println(outWard.getOrbitAt(o_index1, diffType));
                } else if (o_method == 4) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int o_index2 = sc.nextInt();
                    outWard.printOrbitsInRange(o_index2, diffType);
                } else if (o_method == 5) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    outWard.printAllOrbits(diffType);
                }

            } else if (implementNEWS == 3) {// RightWard
                System.out.println("you have chosen RightWard Implementation");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsUpTo \n 5.printAllOrbits");
                int r_method = sc.nextInt();
                if (r_method == 1) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(rightWard.getFirstOrbit(diffType));
                } else if (r_method == 2) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(rightWard.getLastOrbit(diffType));
                } else if (r_method == 3) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int r_index1 = sc.nextInt();
                    System.out.println(rightWard.getOrbitAt(r_index1, diffType));
                } else if (r_method == 4) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int r_index2 = sc.nextInt();
                    rightWard.printOrbitsInRange(r_index2, diffType);
                } else if (r_method == 5) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    rightWard.printAllOrbits(diffType);
                }

            } else if (implementNEWS == 4) {// RightWardReversed
                System.out.println("you have chosen RightWardReversed Implementation");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsUpTo \n 5.printAllOrbits");
                int rr_method = sc.nextInt();
                if (rr_method == 1) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(rightWardReversed.getFirstOrbit(diffType));
                } else if (rr_method == 2) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(rightWardReversed.getLastOrbit(diffType));
                } else if (rr_method == 3) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int rr_index1 = sc.nextInt();
                    System.out.println(rightWardReversed.getOrbitAt(rr_index1, diffType));
                } else if (rr_method == 4) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int rr_index2 = sc.nextInt();
                    rightWardReversed.printOrbitsInRange(rr_index2, diffType);
                } else if (rr_method == 5) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    rightWardReversed.printAllOrbits(diffType);
                }

            } else if (implementNEWS == 5) {// LeftWard
                System.out.println("you have chosen LeftWard Implementation");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsUpTo \n 5.printAllOrbits");
                int l_method = sc.nextInt();
                if (l_method == 1) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(leftWard.getFirstOrbit(diffType));
                } else if (l_method == 2) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(leftWard.getLastOrbit(diffType));
                } else if (l_method == 3) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int l_index1 = sc.nextInt();
                    System.out.println(leftWard.getOrbitAt(l_index1, diffType));
                } else if (l_method == 4) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int l_index2 = sc.nextInt();
                    leftWard.printOrbitsInRange(l_index2, diffType);
                } else if (l_method == 5) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    leftWard.printAllOrbits(diffType);
                }

            } else if (implementNEWS == 6) {// LeftWardReversed
                System.out.println("you have chosen LeftWardReversed Implementation");
                System.out.println(
                        "Select option:\n 1.getFirstOrbit \n 2.getLastOrbit \n 3.getOrbitAt \n 4.printOrbitsUpTo \n 5.printAllOrbits");
                int lr_method = sc.nextInt();
                if (lr_method == 1) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(leftWardReversed.getFirstOrbit(diffType));
                } else if (lr_method == 2) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.println(leftWardReversed.getLastOrbit(diffType));
                } else if (lr_method == 3) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int lr_index1 = sc.nextInt();
                    System.out.println(leftWardReversed.getOrbitAt(lr_index1, diffType));
                } else if (lr_method == 4) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    System.out.print("select index: ");
                    int lr_index2 = sc.nextInt();
                    leftWardReversed.printOrbitsInRange(lr_index2, diffType);
                } else if (lr_method == 5) {
                    System.out.print("Select function: ");
                    diffType = sc.next().toUpperCase();
                    leftWardReversed.printAllOrbits(diffType);
                }

            } else {
                System.out.println("option does not exists");
            }

        } else if (myNum == 3) {
            System.out.println("you have chosen Simple Encryption");

            System.exit(874);
        } else {
            System.out.println("option does not exist");
        }

    }// main method

    // method to encrypt diffused text
    public static String encrypt(String diffusedText, String newMyKey) {

        int newLen = diffusedText.length();
        char[] NewEncryptedMessage = new char[newLen];
        for (int i = 0; i < newLen; i++) {
            NewEncryptedMessage[i] = (char) (((((int) diffusedText.charAt(i) + (int) newMyKey.charAt(i)) % 26 + 26)
                    % 26) + 65);
        }
        return String.valueOf(NewEncryptedMessage);
    }// method encrypt
     // method to decrypt diffused text

    public static String decrypt(String newEncryptedMessage, String newMyKey) {

        int oldLen = newEncryptedMessage.length();
        char[] decryptedMessage = new char[oldLen];

        for (int i = 0; i < oldLen; i++) {
            decryptedMessage[i] = (char) (((((int) newEncryptedMessage.charAt(i) - (int) newMyKey.charAt(i)) % 26 + 26)
                    % 26) + 65);
        }
        return String.valueOf(decryptedMessage);
    }// method decrypt

}
