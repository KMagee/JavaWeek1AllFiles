// see https://pastebin.com/gzucbKeP

package com.avaya;

public class Main {
    // properties
    private String accountHolder;
    private String accountNumber;
    private String accountType;
    private double balance;

    // we don't need a main method since this is not the main class

    // methods
    // getter and setter methods
    public void setAccountHolder(String newHolderName){
        this.accountHolder = newHolderName;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountNumber(String newAccountNumber){
        this.accountNumber = newAccountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountType(String newAccountType){
        this.accountType = newAccountType;
    }

    public String getAccountType(){
        return accountType;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public double getBalance(){
        return balance;
    }

    // methods to manipulate the account balance
    public double withdraw(double amount){
        // are there enough funds for this withrawal?
        double checkIfOk = balance - amount;
        if (checkIfOk < 0){
            System.err.println("not enough funds!!");
        } else {
            balance = checkIfOk;
        }
        return balance;
    }

    public double deposit(double amount){ // one-arg signature

        balance += amount; // same as balance = balance + amount
        return balance;
    }

    public double deposit(double euro, double cents){ // two-arg signature

        double amount = euro + cents/100;
        return this.deposit(amount);
    }

}
