
package THLTHDT;

public class SachTieuThuyet extends Sach {
    private String theLoai;     // Ví dụ: Lãng mạn, Khoa học viễn tưởng
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia,
                          int namXuatBan, int soLuong,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public String toString() {
        return super.toString() + String.format(
            " | Thể loại: %s | Series: %s",
            theLoai, laSachSeries ? "Có" : "Không"
        );
    }
}
=======
package THLTHDT;

public class SachTieuThuyet extends Sach {
    private String theLoai;     // Ví dụ: Lãng mạn, Khoa học viễn tưởng
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia,
                          int namXuatBan, int soLuong,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public String toString() {
        return super.toString() + String.format(
            " | Thể loại: %s | Series: %s",
            theLoai, laSachSeries ? "Có" : "Không"
        );
    }
}