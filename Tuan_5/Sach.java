package lib;

import java.util.Objects;

public class Sach {
    // 1) Thuộc tính - ĐÓNG GÓI
    private String maSach;        // ID duy nhất
    private String tieuDe;        // Tiêu đề
    private String tacGia;        // Tác giả
    private int namXuatBan;       // Năm xuất bản
    private int soLuong;          // Số lượng tồn

    // 2) Constructor mặc định
    public Sach() {
    }

    // 3) Constructor đầy đủ tham số (có validation cơ bản)
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        setMaSach(maSach);
        setTieuDe(tieuDe);
        setTacGia(tacGia);
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    // 4) Getter/Setter - thể hiện ENCAPSULATION + VALIDATION
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        if (maSach == null || maSach.isBlank()) {
            throw new IllegalArgumentException("maSach không được trống");
        }
        this.maSach = maSach.trim();
    }

    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        if (tieuDe == null || tieuDe.isBlank()) {
            throw new IllegalArgumentException("tieuDe không được trống");
        }
        this.tieuDe = tieuDe.trim();
    }

    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        if (tacGia == null || tacGia.isBlank()) {
            throw new IllegalArgumentException("tacGia không được trống");
        }
        this.tacGia = tacGia.trim();
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        int yearNow = java.time.Year.now().getValue();
        if (namXuatBan < 1450 || namXuatBan > yearNow) { // 1450 ~ thời Gutenberg
            throw new IllegalArgumentException("namXuatBan không hợp lệ: " + namXuatBan);
        }
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong < 0) {
            throw new IllegalArgumentException("soLuong không thể âm");
        }
        this.soLuong = soLuong;
    }

    // 5) Phương thức hiển thị theo yêu cầu
    public void hienThiThongTin() {
        System.out.println("=== THÔNG TIN SÁCH ===");
        System.out.println("Mã sách     : " + maSach);
        System.out.println("Tiêu đề     : " + tieuDe);
        System.out.println("Tác giả     : " + tacGia);
        System.out.println("Năm XB      : " + namXuatBan);
        System.out.println("Số lượng    : " + soLuong);
        System.out.println("======================");
    }

    // 6) Hữu ích thêm
    @Override
    public String toString() {
        return String.format("Sach{ma='%s', tieuDe='%s', tacGia='%s', nam=%d, soLuong=%d}",
        maSach, tieuDe, tacGia, namXuatBan, soLuong);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sach)) return false;
        Sach sach = (Sach) o;
        return maSach.equalsIgnoreCase(sach.maSach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSach.toLowerCase());
    }
}