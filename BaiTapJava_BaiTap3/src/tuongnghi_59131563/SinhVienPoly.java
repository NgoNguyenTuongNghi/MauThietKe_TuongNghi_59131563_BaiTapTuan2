package tuongnghi_59131563;

abstract public class SinhVienPoly {
    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    abstract public double getDiem();

    public String getHocLuc(){
        double diem = getDiem();
        String hocLuc;
        if(diem<5) hocLuc = "Yeu";
        else 
            if(diem<6.5) hocLuc = "Trung binh";
            else 
                if(diem<7.5) hocLuc = "Kha";
                else 
                    if(diem<9) hocLuc = "Gioi";
                    else hocLuc = "Xuat sac";

        return hocLuc;
    }
    public void Xuat(){
        System.out.println("\nThong tin sinh vien: " + hoTen);
        System.out.println("Nganh: " + nganh + "\nDiem: " + getDiem() + "\nHoc luc: " + getHocLuc());
    }

}