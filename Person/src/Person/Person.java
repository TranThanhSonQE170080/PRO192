package person;

import java.util.Scanner;

public class Person {
    private String email;
    private String hoten;

    private int age;
    private int phonenum;
    private String diachi;

    /**
     *
     * @param email
     * @param hoten
     * @param age
     * @param phonenum
     * @param diachi
     */
    public Person(String email, String hoten, int age, int phonenum, String diachi) {
        this.email = email;
        this.hoten = hoten;
        this.age = age;
        this.phonenum = phonenum;
        this.diachi = diachi;
    }
    public void Infomation(){
        System.out.println("Email:"+email);
        System.out.println("Hoten:"+hoten);
        System.out.println("Age:"+age);
        System.out.println("Phonenum:0"+phonenum);
        System.out.println("Dia chi:"+diachi);
    }

    void showInformation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void Information() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
