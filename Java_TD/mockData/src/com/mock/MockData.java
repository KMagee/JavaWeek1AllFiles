package com.mock;

import org.datafactory.*;

import java.util.Scanner;

public class MockData {
    public static void main(String[] args) {
        Long bigNum = 265_000_000_000L;
        // user input
        Scanner scanner = new Scanner(System.in);
        String fn = scanner.next();
        String ln = scanner.next();
        System.out.println(fn+ln+bigNum);
    }
}
