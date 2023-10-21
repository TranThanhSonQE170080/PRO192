import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> subjectsTaught = new ArrayList<>();
        subjectsTaught.add("Math");
        subjectsTaught.add("Physics");

        List<String> enrolledCourses = new ArrayList<>();
        enrolledCourses.add("Computer Science");
        enrolledCourses.add("Database Management");

        // Tạo một đối tượng Lecturer
        Lecturer lecturer = new Lecturer("lenhathuy9a6@gmail.com", "Le Nhat Huy", 28, "nam", "0569589113", "28/12/2004", subjectsTaught);

        // Tạo một đối tượng Student
        Student student = new Student("email@example.com", "John Doe", 20, "male", "1234567890", "123 Main St", enrolledCourses);

        System.out.print("Enter email to search: ");
        String searchKeyword = sc.next();
        lecturer.search(searchKeyword);
        student.search(searchKeyword);

        lecturer.displayInfo();
        student.displayInfo();
    }
}

class Person {
    private String email;
    private String fullName;
    private int birthYear;
    private String gender;
    private String phoneNumber;
    private String address;

    public Person(String email, String fullName, int birthYear, String gender, String phoneNumber, String address) {
        this.email = email;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Person Information:");
        System.out.println("Email: " + email);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

class Lecturer extends Person {
    private List<String> subjectsTaught;

    public Lecturer(String email, String fullName, int birthYear, String gender, String phoneNumber, String address,
                    List<String> subjectsTaught) {
        super(email, fullName, birthYear, gender, phoneNumber, address);
        this.subjectsTaught = subjectsTaught;
    }

    public void search(String keyword) {
        if (getEmail().equals(keyword)) {
            System.out.println("Lecturer Found: " + getFullName());
        }
    }

    public void displayInfo() {
        System.out.println("Lecturer Information:");
        super.displayInfo();
        System.out.println("Subjects Taught: " + subjectsTaught);
    }
}

class Student extends Person {
    private List<String> enrolledCourses;

    public Student(String email, String fullName, int birthYear, String gender, String phoneNumber, String address,
                    List<String> enrolledCourses) {
        super(email, fullName, birthYear, gender, phoneNumber, address);
        this.enrolledCourses = enrolledCourses;
    }

    public void search(String keyword) {
        if (getEmail().equals(keyword)) {
            System.out.println("Student Found: " + getFullName());
        }
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        super.displayInfo();
        System.out.println("Enrolled Courses: " + enrolledCourses);
    }
}
