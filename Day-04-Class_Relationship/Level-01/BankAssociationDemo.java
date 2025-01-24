import java.util.ArrayList;
import java.util.List;

// Bank class
class Bank {
    private String bankName;
    private List<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open a new account for a customer
    public void openAccount(Customer customer, String accountNumber, double initialBalance) {
        Account newAccount = new Account(accountNumber, initialBalance, this);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account " + accountNumber + " opened for " + customer.getName() + " at " + bankName);
    }

    // Method to display bank details
    public void displayCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }

    public String getBankName() {
        return bankName;
    }
}

// Customer class
class Customer {
    private String name;
    private List<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add account to customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View balance of all accounts
    public void viewBalance() {
        System.out.println(name + "'s Account Balances:");
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccountNumber() + ": $" + acc.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

// Account class (associated with both Customer and Bank)
class Account {
    private String accountNumber;
    private double balance;
    private Bank bank;

    // Constructor
    public Account(String accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}

// Main class to test the program
public class BankAssociationDemo {
    public static void main(String[] args) {
        // Create a bank
        Bank bank1 = new Bank("ABC Bank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts for customers
        bank1.openAccount(customer1, "123456", 1000.0);
        bank1.openAccount(customer2, "789012", 2000.0);
        bank1.openAccount(customer1, "456789", 500.0);

        // View balance
        customer1.viewBalance();
        customer2.viewBalance();

        // Display bank customers
        bank1.displayCustomers();
    }
}

