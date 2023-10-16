package LO56V2; // Package declaration

import java.util.ArrayList;
import java.util.Scanner;

public class LO56V2 extends Main { // Đổi tên lớp thành LO56V2
    private final ArrayList<String> danhSachMonHoc;

    public LO56V2(String email, String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi) {
        /*super(email, hoVaTen, namSinh, gioiTinh, soDienThoai, diaChi);*/
        danhSachMonHoc = new ArrayList<>();
    }

    public void themMonHoc() {
        String monHocThem;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập số lượng môn học cần thêm: ");
        int soLuong1 = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < soLuong1; i++) {
            System.out.println("Nhập tên môn thứ " + (i + 1) + " cần thêm: ");
            monHocThem = sc1.next();
            danhSachMonHoc.add(monHocThem);
        }
        System.out.println("Danh sách môn học sau khi thêm: ");
        for (String monHoc : danhSachMonHoc) {
            System.out.println(monHoc);
        }
    }

    public void hienThiCacMonHoc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng môn học: ");
        int soLuong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập tên môn thứ " + (i + 1) + ": ");
            String monHoc = sc.next();
            danhSachMonHoc.add(monHoc);
        }
        System.out.println("Danh sách môn học: ");
        for (String monHoc : danhSachMonHoc) {
            System.out.println(monHoc);
        }
    }
}
