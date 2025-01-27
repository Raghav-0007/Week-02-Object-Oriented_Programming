package bankingsystem;

public abstract class BankAccount {
    private String accountNumber;  // Unique account number
    private String holderName;     // Account holder's name
    private double balance;        // Account balance

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter methods to access account details (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Abstract method to be implemented by subclasses for interest calculation
    public abstract double calculateInterest();

}
