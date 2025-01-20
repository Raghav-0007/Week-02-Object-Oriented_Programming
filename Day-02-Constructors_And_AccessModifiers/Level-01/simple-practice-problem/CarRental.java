// Create CarRental class

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Create constructor
    CarRental(){
        customerName="Raghav";
        carModel="scoda";
        rentalDays=15;
    }

    // method to calculate totalcost
    public void getTotalCost(){
        double totalCost=100*rentalDays;
        System.out.println("Total coast: "+totalCost);
    }

    // display the details
    public void displayDetails(){
        System.out.println("customerName: "+this.customerName);
        System.out.println("carModel: "+this.carModel);
        System.out.println("rentalDays: "+this.rentalDays);
        System.out.println();
    }

    public static void main(String[] args) {
        // create CarRental class objects
        CarRental c=new CarRental();
        c.displayDetails();
        c.getTotalCost();
    }
}