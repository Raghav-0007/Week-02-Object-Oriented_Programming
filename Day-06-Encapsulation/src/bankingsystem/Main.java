package bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S123", "Alice", 5000));
        accounts.add(new CurrentAccount("C456", "Bob", 3000));

        // Processing each account dynamically using polymorphism
        for (BankAccount account : accounts) {
            System.out.println("Account: " + account.getAccountNumber() + " | Holder: " + account.getHolderName());

            // Calculate and display interest
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: $" + interest);

            // Handle loan operations if applicable
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan(10000);  // Requesting loan
            }

            // Perform deposit and withdrawal operations
            account.deposit(1000);
            account.withdraw(2000);

            System.out.println("----------------------------------");
        }
    }

}
