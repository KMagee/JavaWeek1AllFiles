package com.r1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Random rnd = new Random();
        Scanner myScanner = new Scanner(System.in);
        String guess = "";
        int secret = rnd.nextInt(10);
        // String secretString = "" + secret;
	    for (int i=5; i>0; i--) {
            guess = myScanner.next();
            if(Integer.parseInt(guess) == secret ){ // if(guess.equals(secretString) ){                                     //
                System.out.println("you win, it was " + secret );
                break;
            } else {
                System.out.println("no, try again");
            }
        }
        if( !(guess.equals(secret)) ){
            System.out.println("you lose, it was " + secret );
        }
    }
}
