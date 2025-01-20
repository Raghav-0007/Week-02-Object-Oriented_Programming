// Create a circle class
public class Circle {
    private double radius;

    // default constractor
    Circle(){
        radius=45;
    }

    //parameteraisrd constractor
    Circle(double radius){
        this.radius=radius;
    }

    // display the details
    public void displayDetails(){
        System.out.println("radius is: "+this.radius);
    }
    public static void main(String[] args) {

        // create circle class objects
        Circle c=new Circle();
        c.displayDetails();
        Circle c2=new Circle(35);
        c2.displayDetails();
    }
}
