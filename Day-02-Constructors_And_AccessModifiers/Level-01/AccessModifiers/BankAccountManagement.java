// Base class: BankAccount
class BankAccount {
    public String accountNumber;      // Public member
    protected String accountHolder;   // Protected member
    private double balance;           // Private member

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | Remaining Balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Available balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;  // Additional attribute specific to SavingsAccount

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance); // Call parent constructor
        this.interestRate = interestRate;
    }

    // Method to calculate and add interest to the balance
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);  // Use deposit method to add interest
        System.out.println("Interest of $" + interest + " added at rate: " + interestRate + "%");
    }

    // Method to display savings account details
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call parent method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the BankAccount and SavingsAccount classes
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("1234567890", "John Doe", 500.0);
        account.displayDetails();

        // Deposit and withdraw money
        account.deposit(200);
        account.withdraw(100);
        account.withdraw(700); // Insufficient funds

        System.out.println();

        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("9876543210", "Alice Smith", 1000.0, 5.0);
        savings.displayDetails();

        // Add interest and display details
        savings.addInterest();
        savings.displayDetails();
    }
}

