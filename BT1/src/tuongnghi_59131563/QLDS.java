package tuongnghi_59131563;

import interfaces.IQLDS;
import java.util.ArrayList;

public class QLDS implements IQLDS {
    private ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    @Override
    public int them(CaNhan cn) {
        dsCaNhan.add(cn);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        if (dsCaNhan.removeIf(cn -> cn.hoTen == ten))
            return 1;
        return 0;
    }

    @Override
    public void inDS() {
        dsCaNhan.forEach(cn -> cn.hienThiTT());
    }
}