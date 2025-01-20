// create person class
public class Person {
    // create person attributes
    private String name;
    private int age;
    private String mobile;

    // create constructor of person class
    Person(String name, int age, String mobile){
        this.name=name;
        this.age=age;
        this.mobile=mobile;
    }

    // create copy constructor
    Person(Person obj){
        this.name=obj.name;
        this.age=obj.age;
        this.mobile=obj.mobile;
    }

    // display the details
    public void displayDetails(){
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("mobile: "+this.mobile);
        System.out.println();
    }
    public static void main(String[] args) {
        // Create person class objects
        Person p1=new Person("Raghav", 20, "9993651063");
        p1.displayDetails();
        Person p2=new Person(p1);
        p2.displayDetails();
    }
}
