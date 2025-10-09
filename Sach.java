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
