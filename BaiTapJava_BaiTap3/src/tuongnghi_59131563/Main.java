package tuongnghi_59131563;

/**
 * Main
 */

public class Main {
    public static void main(String[] args) {
        SinhVienIT sinhVienIT = new SinhVienIT("Ngo Nguyen Tuong Nghi", 10.0, 8.8, 8.0);
        sinhVienIT.Xuat();

        SinhVienBiz sinhVienBiz = new SinhVienBiz("Nguyen Hoang Lan Anh", 10.0, 10.0);
        sinhVienBiz.Xuat();
    }
}