package CoreProgramming.Encapsulation_Polymorphism_Interface_and_Abstract_Class;

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String acc, String name, double bal) {
        accountNumber = acc;
        holderName = name;
        balance = bal;
    }

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { balance -= amt; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String a, String n, double b) { super(a, n, b); }
    public double calculateInterest() { return balance * 0.04; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String a, String n, double b) { super(a, n, b); }
    public double calculateInterest() { return 0; }
    public void applyForLoan() { System.out.println("Loan Applied"); }
    public double calculateLoanEligibility() { return balance * 2; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA1", "Amit", 50000);
        BankAccount acc2 = new CurrentAccount("CA1", "Rohit", 80000);

        System.out.println(acc1.calculateInterest());
        System.out.println(acc2.calculateInterest());
    }
}

