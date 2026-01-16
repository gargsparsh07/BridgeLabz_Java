package Object_oriented_programming.this_static_final_key_words_and_instance_of_operator;

class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display() {
        System.out.println(accountHolderName + " - " + accountNumber);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", 101);

        if (acc instanceof BankAccount) {
            acc.display();
        }

        BankAccount.getTotalAccounts();
    }
}
