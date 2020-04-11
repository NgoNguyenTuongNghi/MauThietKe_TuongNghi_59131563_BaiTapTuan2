package tuongnghi_59131563;

import java.util.ArrayList;

public class QuanLyNhanVien implements  IQuanLy {
    ArrayList<NhanVien>dsNhanVien = new ArrayList<NhanVien>();
    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        System.out.println("\nDanh sach nhan vien trong cong ty: ");
        for (int i = 0; i < dsNhanVien.size() ; i++){
            System.out.println(i+1 + ". " + dsNhanVien.get(i).getThongTin());
        }
    }
}
