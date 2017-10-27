package com.avaya;
import java.lang.reflect.Array;
public class Main {
    public static void main(String[] args) {
        // see what arguments came in
        System.out.println(args[2] + args[1]);
        // get the number of arguments
        int numArgs = args.length;
        String names[] = new String[numArgs];  // or String[] names
	    // declare an array of names
        // Array myArray = new Array({}, {}, {}); // populate an array when we create it
        for(int i=0; i< numArgs; i++)
            names[i] = args[i]; // no need for {} since its one line only
        // how many members in this array?
        int numItems = names.length;
        // find a name by its index number
        for(int i=0; i<numItems; i++) {
            System.out.println( i + " " + names[i]);
        }
    }
}
