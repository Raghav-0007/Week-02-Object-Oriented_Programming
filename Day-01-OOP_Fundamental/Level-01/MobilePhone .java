
// create MobilePhone class
class MobilePhone {

    // attributes of the class
    String brand;
    String model;
    int price;

    // constructor of the class
    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    };

    // method to display the details
    public void displayDetails() {
        System.out.println("MobilePhone detailes......");
        System.out.println("The brand of MobilePhone is: " + brand);
        System.out.println("The model of MobilePhone is: " + model);
        System.out.println("The price of MobilePhone is: " + price);
    }

    // main method to run the code
    public static void main(String[] args) {
        MobilePhone obj = new MobilePhone("OnePlus", "8T", 45000);

        obj.displayDetails();
    }
}
