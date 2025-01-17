// Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.

// circle class
class Circle {

    // attribute
    double radius;

    // circle class constructor for taking value
    public Circle(double radius) {
        this.radius = radius;
    };

    // method to calculate area of circle
    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("The area of circle is: " + area);
    };

    // method to calculate circumference of circle
    public void calculateCircumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("The circumference of circle is: " + circumference);
    };

    // main method
    public static void main(String[] args) {
        Circle obj = new Circle(45);
        obj.calculateArea();
        obj.calculateCircumference();
    }
}
