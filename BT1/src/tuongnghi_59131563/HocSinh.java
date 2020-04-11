package tuongnghi_59131563;

public class HocSinh extends CaNhan {
    private String lop;
    private String nangKhieu;

    public HocSinh() {
        super();
        this.lop = "";
        this.nangKhieu = "";
    }

    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public void setLop(String lop) { 
        this.lop = lop; 
    }
    public void setNangKhieu(String nangKhieu) { 
        this.nangKhieu = nangKhieu; 
    }
    public String getLop() { 
        return this.lop; 
    }
    public String getNangKhieu() { 
        return this.nangKhieu; 
    }

    @Override
    public String hienThiTT() {
        String thongTin = "";
        thongTin = "Ho ten: " + this.hoTen + " -- Tuoi: " + this.tuoi + " -- Dia chi: " + this.diaChi + " -- Sdt: " 
            + this.sdt + " -- Lop: " + this.lop + " -- Nang khieu: " + this.nangKhieu;
        System.out.println(thongTin);
        return thongTin;
    }
}