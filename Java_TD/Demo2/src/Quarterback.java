// A program from Chapter 12 of Sams Teach Yourself Java in 24 Hours
// by Rogers Cadenhead, http://www.java24hours.com/

public class Quarterback extends FootballPlayer {
    public void pass(FootballPlayer p) {
        System.out.println("#" + this.number
            + " passes the ball to " + p.number);
    }
}
