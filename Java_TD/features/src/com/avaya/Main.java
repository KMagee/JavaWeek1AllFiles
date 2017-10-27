// see https://pastebin.com/fymxvbzv

package com.avaya;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String chr = ""; // we need an initial value
        // begin a loop
        // for(int i=0; i < 100; i++) { this only goes up to 100
        while (!(chr.equals("q"))) {
            // ask the user for input
            Scanner myInput = new Scanner(System.in);
            // grab the next character the user types
            chr = myInput.next();
            // check - did they type 'q'?
            //   if( chr.equals("q") ) { // == checks a value
            // if so, we are done, so end the program
            //       System.out.println("you entered q");
            //       break; // this quits a loop
            //   } else {
            // otherwise, print whatever they typed
            System.out.println(chr);
            //  }
            // loop back to the top
        }
    }
}
