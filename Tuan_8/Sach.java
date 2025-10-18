// Tao lop sach
public abstract class Sach {
    // Thuộc tính (attributes) với tính đóng gói (private)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;
    private String viTri;

    // Constructor mac dinh
    public Sach() {}

    // Constructor de khoi tao sach
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
        this.viTri = viTri;
    }

    // Phuong thuc nhan gia tri
    public String getMaSach() {  return maSach;   }

    public String getTieuDe() {  return tieuDe;   }

    public String getTacGia() {  return tacGia;   }

    public int getNamXuatBan() { return namXuatBan;  }

    public int getSoLuong() {    return soLuong;  }
    
    public double getgiaCoBan() {    return giaCoBan;  }

    public String getviTri() {  return viTri;   }
    
    // Phuong thuc nhap gia tri
    public void setMaSach(String maSach) {     this.maSach = maSach;    }

    public void setTieuDe(String tieuDe) {     this.tieuDe = tieuDe;    }

    public void setTacGia(String tacGia) {     this.tacGia = tacGia;    }

    public void setNamXuatBan(int namXuatBan) {   this.namXuatBan = namXuatBan;    }

    public void setSoLuong(int soLuong) {      this.soLuong = soLuong;  }

    public void setgiaCoBan(double giaCoBan) {      this.giaCoBan = giaCoBan;  }

    public void setviTri(String viTri) {     this.viTri = viTri;    }

    // Yêu cầu 2: Phương thức hienThiThongTin()
    public void hienThiThongTin() {
        System.out.println("=====================================");
        System.out.println("THONG TIN SACH:");
        System.out.println("Ma sach: " + this.maSach);
        System.out.println("Tieu de: " + this.tieuDe);
        System.out.println("Tac gia: " + this.tacGia);
        System.out.println("Nam xuat ban: " + this.namXuatBan);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Gia ban co ban: " + this.giaCoBan);
        System.out.println("Vi tri: " + this.viTri);
        System.out.println("=====================================");
    }

    /*
    * -->> Phương thức protected để các lớp con có thể truy cập và lấy thông tin cơ bản. <<--
    * Trả về một chuỗi chứa các thuộc tính chung của sách.
    * Nháy đôi ": Dùng cho chuỗi (một hoặc nhiều ký tự).
    * Nháy đơn ': Dùng cho một ký tự duy nhất.
    */
    protected String getThongTinCoBan() {
        return "maSach ='" + maSach + '\'' + 
            ", tieuDe ='" + tieuDe + '\'' + 
            ", tacGia ='" + tacGia + '\'' + 
            ", namXuatBan =" + namXuatBan + 
            ", soLuong =" + soLuong + 
            ", viTri ='" + viTri + '\'';
    }

    /**
     * Ghi đè (Override) phương thức toString()
     * Bây giờ sẽ sử dụng phương thức trợ giúp getThongTinCoBan()
     */
    @Override
    public String toString() {
        // Giữ nguyên hoạt động cũ cho lớp Sach
        return "Sach{" + getThongTinCoBan() + '}';
    }
    public abstract double tinhGiaBan();
}