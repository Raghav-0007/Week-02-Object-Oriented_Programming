// Base class representing a generic bank account
class BankAccount {
    protected String accountNumber;  // Unique account number
    protected double balance;        // Account balance

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display the account balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

// Subclass representing a savings account with an interest rate
class SavingsAccount extends BankAccount {
    private double interestRate;  // Interest rate for savings account

    // Constructor to initialize savings account attributes
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type and interest rate
    public void displayAccountType() {
        System.out.println("This is a Savings Account with interest rate: " + interestRate + "%");
    }
}

// Subclass representing a checking account with a withdrawal limit
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;  // Maximum withdrawal limit

    // Constructor to initialize checking account attributes
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type and withdrawal limit
    public void displayAccountType() {
        System.out.println("This is a Checking Account with withdrawal limit: $" + withdrawalLimit);
    }
}

// Subclass representing a fixed deposit account with a maturity period
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;  // Maturity period in months

    // Constructor to initialize fixed deposit account attributes
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    // Method to display account type and maturity period
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account with maturity period: " + maturityPeriod + " months");
    }
}

// Main class to test the bank account types
public class BankSystem {
    public static void main(String[] args) {
        // Creating a savings account object
        SavingsAccount savings = new SavingsAccount("SA123", 5000, 4.5);
        savings.displayBalance();
        savings.displayAccountType();

        // Creating a checking account object
        CheckingAccount checking = new CheckingAccount("CA456", 3000, 1000);
        checking.displayBalance();
        checking.displayAccountType();

        // Creating a fixed deposit account object
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000, 12);
        fixedDeposit.displayBalance();
        fixedDeposit.displayAccountType();
    }
}

