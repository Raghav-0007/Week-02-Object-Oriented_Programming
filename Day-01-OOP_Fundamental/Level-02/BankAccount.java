public class BankAccount {
    // Attributes of the BankAccount class
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited. Current balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. Current balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Cannot withdraw $" + amount);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create a BankAccount object with some initial values
        BankAccount account = new BankAccount("John Doe", "123456789", 1000.0);

        // Display initial balance
        account.displayBalance();

        // Deposit some money
        account.deposit(500.0);

        // Try to withdraw more money than the balance
        account.withdraw(2000.0);

        // Withdraw a valid amount
        account.withdraw(200.0);

        // Display the final balance
        account.displayBalance();
    }
}

