package bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable{
    private double overdraftLimit = 5000;  // Overdraft limit

    // Constructor to initialize current account
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implement interest calculation
    @Override
    public double calculateInterest() {
        return 0;  // No interest for current accounts
    }

    // Method to apply for a loan
    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of $" + amount + " approved for account " + getAccountNumber());
        } else {
            System.out.println("Loan request denied for account " + getAccountNumber());
        }
    }

    // Method to check loan eligibility based on balance
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 2000;  // Eligible if balance is at least $2000
    }

}
