package CoreProgramming.JavaClassAndObject.level2;

import java.util.Scanner;

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount b = new BankAccount();

        System.out.println("Enter Bank Account Details");
        System.out.print("Account Holder Name: ");
        b.accountHolder = sc.nextLine();

        System.out.print("Account Number: ");
        b.accountNumber = sc.nextLong();

        System.out.print("Initial Balance: ");
        b.balance = sc.nextDouble();

        System.out.print("Deposit Amount: ");
        b.deposit(sc.nextDouble());

        System.out.print("Withdraw Amount: ");
        b.withdraw(sc.nextDouble());

        b.displayBalance();
    }
}
