package com.bankTest;

class BankAccount {
    int acNo;
    String acName, acPhone, acEmail;
    double AcBal;

    public BankAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
        this.acNo = acNo;
        this.acName = acName;
        this.acPhone = acPhone;
        this.acEmail = acEmail;
        this.AcBal = AcBal;
    }

    public void accountholder() {
        System.out.println("Account Number: " + acNo);
        System.out.println("Account Holder Name: " + acName);
        System.out.println("Account Holder Address: " + acPhone);
        System.out.println("Account Holder Phone: " + acEmail);
        System.out.println("Account Holder Balance: $" + AcBal);
    }

    public void deposit(double amount) {
        AcBal += amount;
        System.out.println("Deposited: $" + amount);
    }
}
//adding a current account sub class
class CurrentAccount extends BankAccount {
    public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
        super(acNo, acName, acPhone, acEmail, AcBal);
    }
}
//savings account class
class SavingsAccount extends BankAccount {
    public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
        super(acNo, acName, acPhone, acEmail, AcBal);
    }

   
}

public class Account {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1001, "Ann Kamau", "07200000", "ann01kamauu@gmail.com", 1000.0);
        System.out.println("SAVINGS ACCOUNT DETAILS");
        savingsAccount.accountholder();
        savingsAccount.deposit(300.0); //deposit amount 300
        System.out.println("Account Number: " + savingsAccount.acNo);
        System.out.println("Balance: $" + savingsAccount.AcBal);

        CurrentAccount currentAccount = new CurrentAccount(1001, "Peter Smith", "08100000", "smithpeter@gmail.com", 0.0);
        System.out.println("\nCURRENT ACCOUNT DETAILS");
        currentAccount.accountholder();
        currentAccount.deposit(300.0); // deposit amount  300
        System.out.println("Account Number: " + currentAccount.acNo);
        System.out.println("Balance: $" + currentAccount.AcBal);
    }
}

