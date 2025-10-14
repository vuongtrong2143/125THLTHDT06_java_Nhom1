// Tao lop sach
public class Sach {
    // Thuộc tính (attributes) với tính đóng gói (private)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor mac dinh
    public Sach() {}

    // Constructor de khoi tao sach
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Phuong thuc nhan gia tri
    public String getMaSach() {  return maSach;   }

    public String getTieuDe() {  return tieuDe;   }

    public String getTacGia() {  return tacGia;   }

    public int getNamXuatBan() { return namXuatBan;  }

    public int getSoLuong() {    return soLuong;  }

    // Phuong thuc nhap gia tri
    public void setMaSach(String maSach) {     this.maSach = maSach;    }

    public void setTieuDe(String tieuDe) {     this.tieuDe = tieuDe;    }

    public void setTacGia(String tacGia) {     this.tacGia = tacGia;    }

    public void setNamXuatBan(int namXuatBan) {   this.namXuatBan = namXuatBan;    }

    public void setSoLuong(int soLuong) {      this.soLuong = soLuong;  }

    // Yêu cầu 2: Phương thức hienThiThongTin()
    public void hienThiThongTin() {
        System.out.println("=====================================");
        System.out.println("THONG TIN SACH:");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("=====================================");
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach='" + maSach + '\'' + ", tieuDe='" + tieuDe + '\'' + ", tacGia='" + tacGia + '\'' + ", namXuatBan=" + namXuatBan + ", soLuong=" + soLuong + '}';
    }
}
/* 
// --------------------------------------------------------------------------

// Yêu cầu 3: Xây dựng lớp Test (ví dụ: TestSach) để tạo đối tượng từ lớp Sach
class TestSach {
    public static void main(String[] args) {
        // Sử dụng Constructor đầy đủ
        System.out.println("--- SACH 1: Su dung Constructor day du ---");
        Sach sach1 = new Sach(  "S001", 
                                "TH Lap trinh huong doi tuong",
                                "Nguyen Van A",
                                2023,
                                150);

        // Hiển thị thông tin sách 1
        sach1.hienThiThongTin();

        // Sử dụng Constructor mặc định, Set, Get
        System.out.println("\n--- SACH 2: Su dung Constructor mac dinh va Setters ---");
        Sach sach2 = new Sach();

        // Yêu cầu 5: Sử dụng Setters để thiết lập giá trị
        sach2.setMaSach("S002");
        sach2.setTieuDe("Khoa hoc may tinh");
        sach2.setTacGia("Tran Thi B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(200);

        // Hiển thị thông tin sách 2 sau khi cập nhật
        sach2.hienThiThongTin();

        // Yêu cầu 5: Ví dụ về việc sử dụng Getters
        System.out.println("\nKiem tra Getter (Sach 1):");
        sach1.setTieuDe("TH Co so du lieu 2");
        sach1.setTacGia("Luong Tan C");

        // Hiển thị thông tin sách 1 sau khi cập nhật
        sach1.hienThiThongTin();       
    }
}
*/