package lo567;

public class person {
    private final String email;
    private final String fullName;
    private final int birthYear;
    private final String gender;
    private final String phoneNumber;
    private final String address;

    public person(String email, String fullName, int birthYear, String gender, String phoneNumber, String address) {
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

    // Các phương thức và thuộc tính khác của lớp Person (nếu cần)
}
