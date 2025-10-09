import java.util.Scanner;

// ==========================
// 🧩 Lớp Sach (Book)
// ==========================
public class Sach {
    // 🔒 Yêu cầu 1: Các thuộc tính (đóng gói bằng private)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // 🏗 Yêu cầu 4: Constructor không tham số
    public Sach() {
    }

    // 🏗 Constructor có tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // 🔐 Getter và Setter (thể hiện tính đóng gói - Yêu cầu 5)
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

    // 📘 Yêu cầu 2: Phương thức hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.println("──────────────────────────────");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("──────────────────────────────");
    }

    // ✏️ Thêm phương thức nhập thông tin sách (cho tiện thực hành)
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();

        System.out.print("Nhập tiêu đề: ");
        tieuDe = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        namXuatBan = sc.nextInt();

        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();
    }
}

// ==========================
// 🧪 Lớp Test (chạy chương trình)
// ==========================
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ SÁCH TRONG THƯ VIỆN ===");

        // 🪄 Tạo 1 sách bằng constructor có tham số
        Sach sach1 = new Sach("B001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2022, 10);

        // 🪄 Tạo 1 sách bằng constructor rỗng và nhập thông tin từ bàn phím
        Sach sach2 = new Sach();
        System.out.println("\nNhập thông tin cho cuốn sách thứ 2:");
        sach2.nhapThongTin();

        // 🧾 Hiển thị thông tin các sách
        System.out.println("\n=== DANH SÁCH SÁCH HIỆN CÓ ===");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        System.out.println("Chương trình kết thúc. 🎉");
    }
}
