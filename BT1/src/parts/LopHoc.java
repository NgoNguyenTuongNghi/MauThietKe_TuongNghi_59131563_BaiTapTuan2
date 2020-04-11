package parts;

import java.util.ArrayList;

public class LopHoc {
    private QLDS dsHS = new QLDS();
    private QLDS dsGV = new QLDS();

    public int themHS(HocSinh hocSinh){
        dsHS.them( hocSinh);
        return 1;
    }
    public int inDSHS(){
        dsHS.inDS(dsHS.getDs());
        return 1;
    }

    public int themGV(GiaoVien giaoVien){
        dsGV.them( giaoVien);
        return 1;
    }
    public int  inDSGV(){
        dsGV.inDS(dsGV.getDs());
        return 1;
    }
}