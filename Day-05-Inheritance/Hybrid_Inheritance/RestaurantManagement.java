// Superclass representing a person in the restaurant system
class Person {
    protected String name;  
    protected int id;     

    // Constructor to initialize name and id
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display basic information
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface defining worker responsibilities
interface Worker {
    // Abstract method to be implemented by all workers
    void performDuties();
}

// Subclass representing a chef, inheriting from Person and implementing Worker interface
class Chef extends Person implements Worker {
    private String specialty;  // Chef's area of expertise

    // Constructor to initialize chef attributes
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implementing performDuties method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes.");
    }
}

// Subclass representing a waiter, inheriting from Person and implementing Worker interface
class Waiter extends Person implements Worker {
    private int tableNumber;  // Assigned table number for the waiter

    // Constructor to initialize waiter attributes
    public Waiter(String name, int id, int tableNumber) {
        super(name, id);
        this.tableNumber = tableNumber;
    }

    // Implementing performDuties method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at table " + tableNumber);
    }
}

// Main class to test the restaurant management system
public class RestaurantManagement {
    public static void main(String[] args) {
        // Creating a Chef object
        Chef chef = new Chef("Gordon", 101, "Italian");
        chef.displayInfo();
        chef.performDuties();

        // Creating a Waiter object
        Waiter waiter = new Waiter("John", 202, 5);
        waiter.displayInfo();
        waiter.performDuties();
    }
}

