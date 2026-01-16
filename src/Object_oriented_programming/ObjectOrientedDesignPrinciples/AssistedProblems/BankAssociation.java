package Object_oriented_programming.ObjectOrientedDesignPrinciples.AssistedProblems;

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c) {
        System.out.println(c.name + " opened account in " + bankName);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c = new Customer("Amit", 5000);

        bank.openAccount(c);
        c.viewBalance();
    }
}
