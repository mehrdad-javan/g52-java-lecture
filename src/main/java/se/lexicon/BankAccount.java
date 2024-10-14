package se.lexicon;

public class BankAccount {

    static double interestRate = 5.0;

    String accountHolder;
    double balance;


    public static void setInterestRate(double rate){
        interestRate = rate;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void displayAccountInfo(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("InterestRate: " + BankAccount.interestRate);
    }

}
