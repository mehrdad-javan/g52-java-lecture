package se.lexicon;

public class StaticInstanceDemo {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Mehrdad";
        account1.balance = 1000.00;

        BankAccount.setInterestRate(5.9);
        System.out.println(BankAccount.interestRate);

        BankAccount account2 = new BankAccount();
        account2.accountHolder = "Marcus";
        account2.balance = 2000.00;

        account1.displayAccountInfo(); // InterestRate = 5.9
        account2.displayAccountInfo(); //  InterestRate = 5.9

        account1.deposit(500.00);

        System.out.println("------------------------");
        account1.displayAccountInfo(); // InterestRate = 5.9
        account2.displayAccountInfo(); // InterestRate = 5.9



    }

}
