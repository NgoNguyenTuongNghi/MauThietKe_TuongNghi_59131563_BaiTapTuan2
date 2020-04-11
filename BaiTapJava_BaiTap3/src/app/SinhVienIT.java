package app;

public class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemCSS;
    private double diemHTML;

    public SinhVienIT(String hoTen, double diemJava, double diemCSS, double diemHTML) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() {
        return (diemJava*2 + diemCSS + diemHTML)/(double)4;
    }
}