package app;

import java.util.ArrayList;

public class QuanLyNhanVien implements  IQuanLy {
    ArrayList<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for (int i = 0;i<dsNhanVien.size();i++){
            System.out.println(i+1+" ---------------------------------------------------------------------------------------------------------");
            System.out.println(dsNhanVien.get(i).getThongTin());
        }
    }
}
