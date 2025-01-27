package bankingsystem;

public interface Loanable {
    void applyForLoan(double amount);       // Apply for a loan
    boolean calculateLoanEligibility();     // Check loan eligibility
}
