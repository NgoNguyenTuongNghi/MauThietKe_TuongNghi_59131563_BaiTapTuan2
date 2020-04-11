package tuongnghi_59131563;

public class NgoaiThanh extends ChuyenXe {
    private double soNgay;
    private String noiDen;

    public NgoaiThanh(String maSo, String hoTen, String soXe, String noiDen, double soNgay, double doanhThu) {
        super(maSo, hoTen, soXe, doanhThu);
        this.soNgay = soNgay;
        this.noiDen = noiDen;
    }

    @Override
    public void Xuat() {
        System.out.println("Ma so: " + maSo + " -- Hoten: " + hoTen + " -- So xe: " + soXe + " -- Noi den: "
            + noiDen + " -- So ngay: " + soNgay + " -- Doanh thu: " + doanhThu);
    }
}