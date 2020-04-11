package tuongnghi_59131563;

import parts.GiaoVien;
import parts.HocSinh;
import parts.LopHoc;

public class Main {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("Ngo Nguyen Tuong Nghi", 25, "Khanh Hoa", "0956864235", "59cntt2", "Coding");
        HocSinh hs2 = new HocSinh("Tran Thanh Thi", 22, "Khanh Hoa", "0856324596", "59cntt2", "Testing");
        HocSinh hs3 = new HocSinh("Diep Tu Thinh", 21, "Khanh Hoa", "0258648215", "59cntt2", "Design");

        GiaoVien gv1 = new GiaoVien("Nguyen Dinh Thuan", 59, "Khanh Hoa", "0965425840", "Database", "IT");
        GiaoVien gv2 = new GiaoVien("Nguyen Nhu An", 60, "Khanh Hoa", "0832458630", "Discrete mathematics", "IT");
        GiaoVien gv3 = new GiaoVien("Le Tham Duong", 60, "TPHCM", "0756864215", "Economics", "Economics");

        LopHoc lopHoc = new LopHoc();
        lopHoc.themHS(hs1);
        lopHoc.themHS(hs2);
        lopHoc.themHS(hs3);
        lopHoc.themHS(hs1);

        lopHoc.themGV(gv1);
        lopHoc.themGV(gv2);
        lopHoc.themGV(gv3);
        lopHoc.themGV(gv1);

        System.out.println("\nDanh sach hoc sinh:");
        lopHoc.inDSHS();
        System.out.println("\nDanh sach giao vien:");
        lopHoc.inDSGV();
    }
}