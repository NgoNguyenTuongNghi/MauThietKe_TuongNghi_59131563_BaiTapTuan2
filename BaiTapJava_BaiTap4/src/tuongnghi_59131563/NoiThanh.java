package tuongnghi_59131563;

public class NoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKm;

    public NoiThanh(String maSo, String hoTen, String soXe, int soTuyen, double soKm, double doanhThu) {
        super(maSo, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public void Xuat() {
        System.out.println("Ma so: " + maSo + " -- Hoten: " + hoTen + " -- So xe: " + soXe + " -- So Tuyen"
            + soTuyen + " -- So km: " + soKm + " -- Doanh thu: "+doanhThu);
    }
}