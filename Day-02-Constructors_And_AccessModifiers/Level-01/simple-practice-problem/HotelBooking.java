
// Create HotelBooking class
public class HotelBooking {
    // Create attributes
    private String guestName;
    private String roomType;
    private int nights;

    // create default constructor
    HotelBooking(){
        guestName="Raghav";
        roomType="1BHK";
        nights=3;
    }

    // parameterized constructor
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    // copy constructor
    HotelBooking(HotelBooking obj){
        this.guestName=obj.guestName;
        this.roomType=obj.roomType;
        this.nights=obj.nights;
    }

    // display the details
    public void displayDetails(){
        System.out.println("guestName: "+this.guestName);
        System.out.println("roomType: "+this.roomType);
        System.out.println("nights: "+this.nights);
        System.out.println();
    }
    public static void main(String[] args) {
        // Create class objects
        HotelBooking h1=new HotelBooking();
        h1.displayDetails();
        HotelBooking h2=new HotelBooking("pavan", "single", 2);
        h2.displayDetails();
        HotelBooking h3=new HotelBooking(h2);
        h3.displayDetails();
    }
}
