package app;

/**
 * Main
 */

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Ngo Nguyen Tuong Nghi");
        nv1.setTuoi(25);
        nv1.setDiaChi("Dien Khanh, Khanh Hoa");
        nv1.setTienLuong(220000);
        nv1.setTongSoGioLam(130);
        System.out.println("Thong tin nhan vien:\n" + nv1.getThongTin());


        NhanVien nv2 = new NhanVien("Tran Thanh Thi", 22, "Dien Khanh,Khanh Hoa", 200000, 120);
        System.out.println("Thong tin nhan vien:\n" + nv2.getThongTin());


        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        NhanVien nv3 = new NhanVien("Le Tan Dat", 21, "Dien Khanh, Khanh Hoa", 200000, 125);
        NhanVien nv4 = new NhanVien("Diep Tu Thinh", 21, "Nha Trang, Khanh Hoa", 200000, 110);
        NhanVien nv5 = new NhanVien("Nguyen Viet Trong", 21, "Huong Khe, Ha Tinh", 330000, 105);

        quanLyNhanVien.them(nv1);
        quanLyNhanVien.them(nv2);
        quanLyNhanVien.them(nv3);
        quanLyNhanVien.them(nv4);
        quanLyNhanVien.them(nv5);

        quanLyNhanVien.inDS();

    }
}
