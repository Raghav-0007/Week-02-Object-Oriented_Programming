// Create the cource class
public class Course {

    //Create Instance Variables: 
    private String courseName;
    private String duration;
    private double fee;
    // Create class variable
    private static String instituteName="javaTpoint";

    // Create instance methods
    public Course(String courseName, String duration, double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }

    public void displayCourseDetails(){
        System.out.println("courseName: "+ this.courseName);
        System.out.println("duration: "+ this.duration);
        System.out.println("fee: "+ this.fee);
        System.out.println("instituteName: "+ instituteName);
        System.out.println();
    }

    // Create class method
    public static void updateInstituteName(String newName){
        instituteName=newName;
    }
    public static void main(String[] args) {
        // Create class objects
        Course c1=new Course("java", "3 month", 15000);
        c1.displayCourseDetails();
        updateInstituteName("CWH");
        c1.displayCourseDetails();
    }
}
