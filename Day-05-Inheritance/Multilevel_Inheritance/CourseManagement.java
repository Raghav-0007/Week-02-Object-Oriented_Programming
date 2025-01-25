// Base class representing a general course
class Course {
    protected String courseName;
    protected int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// Subclass representing an online course
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass representing a paid online course
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%, Final Fee: $" + calculateFinalFee());
    }
}

// Main class to test the educational course hierarchy
public class CourseManagement {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", 8);
        course.displayCourseDetails();

        OnlineCourse onlineCourse = new OnlineCourse("Python for Data Science", 10, "Udemy", true);
        onlineCourse.displayCourseDetails();

        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Full-Stack Web Development", 12, "Coursera", false, 500, 20);
        paidOnlineCourse.displayCourseDetails();
    }
}

