package app;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SinhVienIT sinhVienIT = new SinhVienIT("Ngo Nguyen Tuong Nghi", 10.0, 8.8, 8.0);
        sinhVienIT.Xuat();

        SinhVienBiz sinhVienBiz = new SinhVienBiz("Nguyen Hoang Lan Anh", 9.0, 9.5);
        sinhVienBiz.Xuat();
    }
}