
// create item class
class Item {
    // attributes
    int itemCode;
    String itemName;
    int price;

    // Item class constructor for taking value
    public Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    };

    // method to calculate the total price
    public void calculateTotalPrice(int items) {
        int totalPrice = price * items;
        System.out.println("The total price of given quantity is: " + totalPrice);
    };

    // method to show the detailes
    public void showDetails() {
        System.out.println("Item detailes......");
        System.out.println("The itemCode is: " + itemCode);
        System.out.println("The itemName is: " + itemName);
        System.out.println("The price of item is: " + price);
    };

    // main method to run the code
    public static void main(String[] args) {
        Item obj = new Item(0057, "Laptop", 50000);
        obj.calculateTotalPrice(5);
        obj.showDetails();
    }
}
