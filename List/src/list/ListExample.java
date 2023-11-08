package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String email, String subject) {
        super(name, email);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}

class Student extends Person {
    private String major;

    public Student(String name, String email, String major) {
        super(name, email);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}

public class ListExample {
    private static List<Person> people = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    addTeacher(scanner);
                    break;
                case 2:
                    addStudent(scanner);
                    break;
                case 3:
                    searchPerson(scanner, Teacher.class);
                    break;
                case 4:
                    searchPerson(scanner, Student.class);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Options: 1. Add Teacher 2. Add Student 3. Search Teacher 4. Search Student 5. Exit");
    }

    private static void addTeacher(Scanner scanner) {
        System.out.print("Teacher name, email, subject: ");
        String name = scanner.next();
        String email = scanner.next();
        String subject = scanner.next();
        people.add(new Teacher(name, email, subject));
        System.out.println("Teacher added!");
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Student name, email, major: ");
        String name = scanner.next();
        String email = scanner.next();
        String major = scanner.next();
        people.add(new Student(name, email, major));
        System.out.println("Student added!");
    }

    private static void searchPerson(Scanner scanner, Class<? extends Person> type) {
        System.out.print("Enter " + type.getSimpleName() + " email to search: ");
        String email = scanner.next();
        for (Person person : people) {
            if (person.getEmail().equals(email) && type.isInstance(person)) {
                System.out.println("Person found: " + person);
                return;
            }
        }
        System.out.println(type.getSimpleName() + " not found.");
    }
}
