package com.avaya.basic;

// import useful utilities
import java.util.*; // the asterisk imports everything

public class Main {

    // show the square root of a number
    public static void main(String[] args) { // [] means an array
        Random myRand = new Random();
	    // declare a variable
        int myNum = myRand.nextInt();
        if(args.length > 0){
            myNum = Integer.parseInt(args[0]);
        }

        System.out.println( "When the number is "
                + myNum
                + " The square root is \n"
                + Math.sqrt(myNum) );

    }
}
