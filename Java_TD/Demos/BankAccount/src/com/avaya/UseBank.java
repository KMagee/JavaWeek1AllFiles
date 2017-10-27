package com.avaya;

public class UseBank {

    // we need a main method since this is the main class
    public static void main(String[] args){
        // create a BankAccount instance
        Main account1 = new Main();
        account1.setAccountHolder("Ada");
        System.out.println( "Holder name " + account1.getAccountHolder() );
        // make a deposit
        account1.deposit(1000);
        // make another deposit
        account1.deposit(500, 56);
        // make a withdrawal
        account1.withdraw(50);
        // check the balance
        System.out.println( account1.getBalance() );
    }

}