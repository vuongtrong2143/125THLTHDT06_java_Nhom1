// SachGiaoTrinh.java
public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri, String monHoc) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri);
        this.monHoc = monHoc;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.1; // Giá bán = giá cơ bản + 10%
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Môn học: %s | Giá bán: %.2f", monHoc, tinhGiaBan());
    }
}

// SachTieuThuyet.java
public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri, String theLoai) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri);
        this.theLoai = theLoai;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.25; // Giá bán = giá cơ bản + 25%
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Thể loại: %s | Giá bán: %.2f", theLoai, tinhGiaBan());
    }
}