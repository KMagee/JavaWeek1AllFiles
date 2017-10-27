class Account {
    private static int totalBalance=0;

    private int balance = 0;
    private int overdraft = -1000;

    public void deposit(int n) {
        balance += Math.max(0,n);
        totalBalance += Math.max(0,n);
    }
    public void withdraw(int n) {
        balance -= Math.max(0,n);
        totalBalance -= Math.max(0,n);
    }
    public int getBalance() {
        return balance;
    }
    public int getOverdraft() {
        return overdraft;
    }
    public void setOverdraft(int od) {
        overdraft = od;
    }
    public Account(int b, int od) {
        deposit(b);;
        overdraft = od;
    }
    public Account(int b) {
        this(b,0);
    }
    public Account() {
        this(0,0);
    }
    public static int getTotalBalance() {
        return totalBalance;
    }
    public boolean equals(Object o) {
        if (o instanceof Account) {
            Account other = (Account)o;
            if (balance==other.balance && overdraft==other.overdraft) {
                return true;
            }
        }
        return false;
    }
}

class SavingsAccount extends Account {
    public void withdraw(int n) {
        super.withdraw(n+10);
    }
}

class Bank {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        //Create an array of 5 accounts and 5 SavingsAccounts
        for (int i=0; i<10; i+=2) {
            accounts[i] = new Account();
            accounts[i].deposit(100);
            accounts[i+1] = new SavingsAccount();
            accounts[i+1].deposit(100);
        }

        //Withdraw 20 pounds from each and print out the balance
        for (int i=0; i<10; i++) {
            accounts[i].withdraw(20);
            System.out.println("Balance of account "+i+" is: "+accounts[i].getBalance());
        }
    }
}