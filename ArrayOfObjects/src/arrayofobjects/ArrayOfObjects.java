package arrayofobjects;

import java.util.ArrayList;
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
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options: 1. Add Teacher 2. Add Student 3. Search Teacher 4. Search Student 0. Exit");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice == 1) {
                System.out.print("Teacher name, email, subject: ");
                String name = scanner.next();
                String email = scanner.next();
                String subject = scanner.next();
                teachers.add(new Teacher(name, email, subject));
                System.out.println("Teacher added!");
            } else if (choice == 2) {
                System.out.print("Student name, email, major: ");
                String name = scanner.next();
                String email = scanner.next();
                String major = scanner.next();
                students.add(new Student(name, email, major));
                System.out.println("Student added!");
            } else if (choice == 3) {
                System.out.print("Enter teacher email to search: ");
                String email = scanner.next();
                for (Teacher teacher : teachers) {
                    if (teacher.getEmail().equals(email)) {
                        System.out.println("Teacher found: " + teacher.getName() + ", Subject: " + teacher.getSubject());
                    }
                }
            } else if (choice == 4) {
                System.out.print("Enter student email to search: ");
                String email = scanner.next();
                for (Student student : students) {
                    if (student.getEmail().equals(email)) {
                        System.out.println("Student found: " + student.getName() + ", Major: " + student.getMajor());
                    }
                }
            }
        }

        scanner.close();
    }
}
