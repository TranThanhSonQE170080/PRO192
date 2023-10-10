package person;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    
    System.out.print("Enter full name: ");  
    String fullname = scanner.nextLine();
    
    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    
    System.out.print("Enter phone number: ");
    int phonenum = scanner.nextInt();
    
    scanner.nextLine(); // read blank line
    
    System.out.print("Enter address: ");
    String address = scanner.nextLine();

    Person person = new Person(email, fullname, age, phonenum, address);
    
    person.Information();
    
  }

}