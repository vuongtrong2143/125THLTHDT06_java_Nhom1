package com.mycompany.THLTHDT;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia,
                          int namXuatBan, int soLuong, double giaCoBan,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    // IGiaBan:
    // Giá bán = giaCoBan + (nếu laSachSeries == true thì +15000, ngược lại +0)
    @Override
    public double tinhGiaBan() {
        double giaBan = getGiaCoBan();
        if (laSachSeries) {
            giaBan += 15000;
        }
        return giaBan;
    }

    // IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + getTieuDe()
                + "\" đến khu vực: " + viTriMoi + ".");
    }

    @Override
    public String toString() {
        return "=== SÁCH TIỂU THUYẾT ===\n"
                + super.toString()
                + "\nThể loại: " + theLoai
                + "\nLà sách series: " + (laSachSeries ? "Có" : "Không")
                + "\nGiá bán: " + tinhGiaBan() + " VNĐ";
    }
}

