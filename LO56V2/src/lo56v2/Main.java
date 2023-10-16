package LO56V2; // Ensure you are in the correct package

public class Main {
    public static void main(String[] args) {
        // Create an instance of GiangVien
       LO56V2 giangVien = new LO56V2("example@email.com", "John Doe", 1980, "Male", "123456789", "123 Main St");


        // Call the method to add subjects
        giangVien.themMonHoc();

        // Call the method to display subjects
        giangVien.hienThiCacMonHoc();
    }
}
