package lo9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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

public class lo9 {
    private Set<String> emailSet = new HashSet<>();
    private Map<String, Person> peopleMap = new HashMap<>();
    private Queue<Person> pendingQueue = new LinkedList<>();

    public static void main(String[] args) {
        lo9 dataManagement = new lo9();
        dataManagement.loadData("teachers.txt");
        dataManagement.loadData("students.txt");

        // Thêm giảng viên và sinh viên mới
        dataManagement.addTeacher("John", "john@email.com", "Math");
        dataManagement.addStudent("Alice", "alice@email.com", "Computer Science");

        // In ra thông tin của tất cả người trong Map
        dataManagement.printAllPeople();
    }

    public void loadData(String filename) {
        try (FileReader reader = new FileReader(filename);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length >= 4) {
                    String name = parts[0];
                    String email = parts[1];
                    String className = parts[2];
                    String additionalInfo = parts[3];
                    if (!emailSet.contains(email)) {
                        Person person = null;
                        if (className.equals("Teacher")) {
                            String subject = additionalInfo;
                            person = new Teacher(name, email, subject);
                        } else if (className.equals("Student")) {
                            String major = additionalInfo;
                            person = new Student(name, email, major);
                        }
                        if (person != null) {
                            emailSet.add(email);
                            peopleMap.put(email, person);
                        }
                    }
                }
            }
        } catch (IOException e) {
        }
    }

    public void addTeacher(String name, String email, String subject) {
        if (!emailSet.contains(email)) {
            Teacher teacher = new Teacher(name, email, subject);
            emailSet.add(email);
            peopleMap.put(email, teacher);
            System.out.println("Teacher added!");
        } else {
            System.out.println("Teacher with this email already exists.");
        }
    }

    public void addStudent(String name, String email, String major) {
        if (!emailSet.contains(email)) {
            Student student = new Student(name, email, major);
            emailSet.add(email);
            peopleMap.put(email, student);
            System.out.println("Student added!");
        } else {
            System.out.println("Student with this email already exists.");
        }
    }

    public void printAllPeople() {
        for (Person person : peopleMap.values()) {
            System.out.println(person);
        }
    }

    private static class emailSet {

        public emailSet() {
        }
    }
}
