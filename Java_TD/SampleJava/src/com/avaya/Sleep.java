package com.avaya;// A program from Chapter 18 of Sams Teach Yourself Java in 24 Hours
// by Rogers Cadenhead, http://www.java24hours.com/

public class Sleep {
    static void pause(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ie) {
            // do nothing
        }
    }
}