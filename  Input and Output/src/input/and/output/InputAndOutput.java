package input.and.output;

import java.io.*;
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

public class InputAndOutput {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options: 1. Add Teacher 2. Add Student 3. Search Teacher 4. Search Student 5. Exit");
            int choice = scanner.nextInt();

            if (choice == 5) {
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
                searchTeacher(teachers, email);
            } else if (choice == 4) {
                System.out.print("Enter student email to search: ");
                String email = scanner.next();
                searchStudent(students, email);
            }
        }

        // Save data to files
        saveData("teachers.txt", teachers);
        saveData("students.txt", students);

        scanner.close();
    }

    public static void searchTeacher(ArrayList<Teacher> teachers, String email) {
        for (Teacher teacher : teachers) {
            if (teacher.getEmail().equals(email)) {
                System.out.println("Teacher found: " + teacher);
                writeToFile("teacher_search_result.txt", teacher.toString());
                return;
            }
        }
        System.out.println("Teacher not found.");
    }

    public static void searchStudent(ArrayList<Student> students, String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                System.out.println("Student found: " + student);
                writeToFile("student_search_result.txt", student.toString());
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void writeToFile(String filename, String data) {
        try (FileWriter writer = new FileWriter(filename, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveData(String filename, ArrayList<? extends Person> data) {
        try (FileWriter writer = new FileWriter(filename);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (Person person : data) {
                bufferedWriter.write(person.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
