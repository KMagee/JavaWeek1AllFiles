import java.util.*;

class PrintNames {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Steve");
        v.add("Neal");
        v.add("Wrote");
        v.add("This");

        Enumeration enum = v.elements();
        while(enum.hasMoreElements()) {
            System.out.println(enum.nextElement());
        }
    }
}