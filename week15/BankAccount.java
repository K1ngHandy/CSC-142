package week15;

public class BankAccount {
    private String id;
    private double balance;
    private int transactions;

    // Constructs a BankAccount object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String id) {
        this.id = id;
        this.balance = 0.0;
        this.transactions = 0;
    }

    // returns the field values
    public double getBalance() {
        return this.balance;
    }

    public String getID() {
        return this.id;
    }

    public String getTransactions() {
        return transactions + " Transactions.";
    }

    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount) {
        if (amount < 500 && amount > 0) {
            this.balance = this.balance + amount;
            this.transactions += 1;
        }
    }

    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
            this.transactions += 1;
        }
    }

    // your method would go here
    public void transfer(BankAccount id, double amount) {
        // invalid transfer
        if (amount <= 0 || this.balance < 5) {
            return;
        }

        double transferAmount;
        if (this.balance >= amount + 5) {
            // full transfer
            transferAmount = amount;
        } else {
            // low balance
            transferAmount = this.balance - 5;
        }

        this.balance -= (transferAmount + 5);
        id.balance += transferAmount;
        this.transactions += 1;
        id.transactions += 1;
    }

    public static void main(String[] args) {
        BankAccount ben = new BankAccount("Benson");
        ben.deposit(90.00);
        BankAccount mar = new BankAccount("Marty");
        mar.deposit(25.00);

        System.out.println(ben.getBalance());
        System.out.println(mar.getBalance());
    }
}
