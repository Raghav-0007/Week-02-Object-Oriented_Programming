import java.util.ArrayList;

// Create BankAccound class
public class BankAccount {
    private static String bankName="SBI";
    private String accountHolderName;
    private final String accountNumber;
    private static ArrayList<BankAccount> arr=new ArrayList<>();
    
    // Create constructor to intialize values
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        arr.add(this);
    }

    // Create method to get account details
    public void getAccountDetails() {
        System.out.println("bankName: "+ bankName);
        System.out.println("accountHolderName: "+ this.accountHolderName);
        System.out.println("accountNumber: "+ this.accountNumber);
        System.out.println();
    }
    
    // Create a method to get total accounts
    static void getTotalAccounts(){
        for (BankAccount obj : arr) {
            obj.getAccountDetails();
        }
    }

public static void main(String[] args) {
    // Create class objects
    BankAccount obj1=new BankAccount("abc", "001");
    BankAccount obj2=new BankAccount("xyz", "002");
    BankAccount obj3=new BankAccount("lmn", "003");

    // Check the instance of object
    boolean result=obj1 instanceof BankAccount;
    System.out.println(result);
    getTotalAccounts();
}

    
}