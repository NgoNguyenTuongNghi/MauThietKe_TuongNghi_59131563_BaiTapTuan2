package tuongnghi_59131563;

abstract public class ChuyenXe {
    String maSo;
    String hoTen;
    String soXe;
    double doanhThu;

   public ChuyenXe(String maSo, String hoTen, String soXe, double doanhThu) {
       this.maSo = maSo;
       this.hoTen = hoTen;
       this.soXe = soXe;
       this.doanhThu = doanhThu;
   }
   
   abstract public void Xuat();
}