package parts;

public class GiaoVien extends CaNhan {
    private String monDay;
    private String toBoMon;

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    public GiaoVien(String hoten, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoten, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    String hienThiTT() {
        return "Hoten: " + getHoten() + " -- Tuoi:" + getTuoi() + " -- Dia chi: " + getDiaChi() + " -- So dien thoai: "+ getSdt() 
            + " -- Mon day: " + getMonDay() + " -- To bo mon: "+getToBoMon();
    }
}