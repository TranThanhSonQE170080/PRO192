package lo567;

import java.util.List;

public class Lecturer {
    private final String email;
    private final String fullName;
    private final int birthYear;
    private final String gender;
    private final String phoneNumber;
    private final String address;
    protected List<String> subjectsTaught;

    public Lecturer(String email, String fullName, int birthYear, String gender, String phoneNumber, String address,
                    List<String> subjectsTaught) {
        this.email = email;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.subjectsTaught = subjectsTaught;
    }

    public void displayInfo() {
        System.out.println("Lecturer Information:");
        System.out.println("Email: " + email);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Subjects Taught: " + subjectsTaught);
    }

    public void search(String keyword) {
        if (email.equals(keyword)) {
            System.out.println("Lecturer Found: " + fullName);
        }
    }
}
