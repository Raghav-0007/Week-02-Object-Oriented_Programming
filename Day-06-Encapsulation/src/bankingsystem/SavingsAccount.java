package bankingsystem;

public class SavingsAccount extends BankAccount {
    private double interestRate = 0.04;  // 4% annual interest

    // Constructor to initialize savings account
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implement interest calculation for savings account
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

}
