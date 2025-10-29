import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Sach {
    // ====================== THUỘC TÍNH ======================
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // ====================== CONSTRUCTOR ======================
    public Sach() {
        this("N/A", "Chưa đặt tiêu đề", "Chưa rõ", 2000, 0);
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        setMaSach(maSach);
        setTieuDe(tieuDe);
        setTacGia(tacGia);
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    // Constructor sao chép
    public Sach(Sach other) {
        this(other.maSach, other.tieuDe, other.tacGia, other.namXuatBan, other.soLuong);
    }

    // ====================== GETTERS ======================
    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public String getTacGia() { return tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; }

    // ====================== SETTERS ======================
    public void setMaSach(String maSach) {
        if (maSach == null || maSach.isBlank())
            throw new IllegalArgumentException("maSach không được rỗng.");
        this.maSach = maSach.trim();
    }

    public void setTieuDe(String tieuDe) {
        if (tieuDe == null || tieuDe.isBlank())
            throw new IllegalArgumentException("tieuDe không được rỗng.");
        this.tieuDe = tieuDe.trim();
    }

    public void setTacGia(String tacGia) {
        if (tacGia == null || tacGia.isBlank())
            throw new IllegalArgumentException("tacGia không được rỗng.");
        this.tacGia = tacGia.trim();
    }

    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        if (namXuatBan < 1400 || namXuatBan > currentYear)
            throw new IllegalArgumentException("namXuatBan không hợp lệ (1400–" + currentYear + ").");
        this.namXuatBan = namXuatBan;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong < 0)
            throw new IllegalArgumentException("soLuong không được âm.");
        this.soLuong = soLuong;
    }

    // ====================== PHƯƠNG THỨC ======================
    public void hienThiThongTin() {
        System.out.println("--------------------------------------------------");
        System.out.println("Mã sách     : " + maSach);
        System.out.println("Tiêu đề     : " + tieuDe);
        System.out.println("Tác giả     : " + tacGia);
        System.out.println("Năm XB      : " + namXuatBan);
        System.out.println("Số lượng    : " + soLuong);
    }

    public void capNhatSoLuong(int thayDoi) {
        int moi = this.soLuong + thayDoi;
        if (moi < 0)
            throw new IllegalArgumentException("Cập nhật số lượng khiến kho âm.");
        this.soLuong = moi;
    }

    // ====================== MAIN (DEMO) ======================
    public static void main(String[] args) {
        Sach s1 = new Sach("B001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2022, 10);
        Sach s2 = new Sach("B002", "Cấu trúc dữ liệu & Giải thuật", "Trần Thị B", 2020, 5);
        Sach s3 = new Sach(s1);
        s3.setMaSach("B003");
        s3.capNhatSoLuong(-3);

        List<Sach> thuVien = new ArrayList<>();
        thuVien.add(s1);
        thuVien.add(s2);
        thuVien.add(s3);

        System.out.println("DANH MỤC SÁCH TRONG THƯ VIỆN");
        for (Sach s : thuVien)
            s.hienThiThongTin();

        System.out.println("\n>>> Cập nhật số lượng cho B001 (+2)");
        s1.capNhatSoLuong(2);
        s1.hienThiThongTin();
    }
}
=======
import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {
        this.maSach = "";
        this.tieuDe = "";
        this.tacGia = "";
        this.namXuatBan = 0;
        this.soLuong = 0;
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + getMaSach());
        System.out.println("Tieu de: " + getTieuDe());
        System.out.println("Tac gia: " + getTacGia());
        System.out.println("Nam xuat ban: " + getNamXuatBan());
        System.out.println("So luong: " + getSoLuong());
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sach sach1 = new Sach();
        System.out.print("Nhap ma sach 1: ");
        sach1.setMaSach(scanner.nextLine());
        System.out.print("Nhap tieu de ma sach 1: ");
        sach1.setTieuDe(scanner.nextLine());
        System.out.print("Nhap tac gia sach 1: ");
        sach1.setTacGia(scanner.nextLine());
        System.out.print("Nhap nam xuat ban sach 1: ");
        sach1.setNamXuatBan(scanner.nextInt());
        System.out.print("Nhap so luong sach 1: ");
        sach1.setSoLuong(scanner.nextInt());
        scanner.nextLine();

        Sach sach2 = new Sach();
        System.out.print("Nhap ma sach 2: ");
        sach2.setMaSach(scanner.nextLine());
        System.out.print("Nhap tieu de ma sach 2: ");
        sach2.setTieuDe(scanner.nextLine());
        System.out.print("Nhap tac gia sach 2: ");
        sach2.setTacGia(scanner.nextLine());
        System.out.print("Nhap nam xuat ban sach 2: ");
        sach2.setNamXuatBan(scanner.nextInt());
        System.out.print("Nhap so luong sach 2: ");
        sach2.setSoLuong(scanner.nextInt());
        scanner.nextLine();

        System.out.println("\nThong tin sach 1:");
        sach1.hienThiThongTin();

        System.out.println("Thong tin sach 2:");
        sach2.hienThiThongTin();

        scanner.close();
    }
}
=======
package THLTHDT;

public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    @Override
    public String toString() {
        return String.format(
            "Mã: %s | Tên: %s | Tác giả: %s | Năm XB: %d | SL: %d",
            maSach, tieuDe, tacGia, namXuatBan, soLuong
        );
    }
}

=======
package THLTHDT;

public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    @Override
    public String toString() {
        return String.format(
            "Mã: %s | Tên: %s | Tác giả: %s | Năm XB: %d | SL: %d",
            maSach, tieuDe, tacGia, namXuatBan, soLuong
        );
    }
}
=======
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
    /*
     * 3. Ghi đè (Override) phương thức toString()
    */
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

