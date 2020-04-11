package tuongnghi_59131563;

public class GiaoVien extends CaNhan {
    private String monDay;
    private String toBoMon;
  
    public GiaoVien() {
        super();
        this.monDay = "";
        this.toBoMon = "";
    }

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }
  
    public void setMonDay(String monDay) { 
        this.monDay = monDay; 
    }
    public void setToBoMon(String toBoMon) { 
        this.toBoMon = toBoMon; 
    }
    public String getMonDay() { 
        return this.monDay; 
    }
    public String getToBoMon() { 
        return this.toBoMon; 
    }

    @Override
    public String hienThiTT() {
        String thongTin = "";
        thongTin = "Ho ten: " + this.hoTen + " -- Tuoi: " + this.tuoi + " -- Dia chi: " + this.diaChi + "-- Sdt: " + this.sdt 
            + " -- Mon giang day: " + this.monDay + " -- To bo mon: " + this.toBoMon;
        System.out.println(thongTin);
        return thongTin;
    }
}