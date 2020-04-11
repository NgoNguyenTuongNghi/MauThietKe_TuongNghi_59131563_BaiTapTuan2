package tuongnghi_59131563;

import interfaces.IQLDS;

public class LopHoc {
    CaNhan giaoVienCN = new GiaoVien();

    IQLDS qlDSGV = new QLDS();

    IQLDS qlDSHS = new QLDS();

    public LopHoc(GiaoVien gvChuNhiem) {
        this.giaoVienCN = gvChuNhiem;
    }

    public int themHocSinh(HocSinh hs) {
        if (qlDSHS.them(hs) == 1) 
            return 1;
        return 0;
    }

    public int themGVGD(GiaoVien gv) {
        if (qlDSGV.them(gv) == 1) {
            return 1;
        }
        return 0;
    }

    public int inDSHS() {
        System.out.println("Danh sach hoc sinh:");
        qlDSHS.inDS();
        return 1;
    }

    public int inDSGVGD() {
        System.out.println("Danh sach giao vien giang day:");
        qlDSGV.inDS();
        return 1;
    }
}