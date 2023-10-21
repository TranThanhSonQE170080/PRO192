import java.util.List;

public class Student extends Person {
    private String major;
    private List<String> enrolledCourses;

    public Student(String email, String fullName, int birthYear, String gender, String phoneNumber, String address,
                   List<String> enrolledCourses) {
        super(email, fullName, birthYear, gender, phoneNumber, address);
        this.enrolledCourses = enrolledCourses;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Enrolled Courses: " + enrolledCourses);
    }

    public void search(String keyword) {
        if (email.equals(keyword)) {
            System.out.println("Student Found: " + fullName);
        }
    }
}
